package ro.uvt.services;

import org.json.JSONArray;
import org.json.JSONObject;
import ro.uvt.models.*;

import java.util.Map;

public class BookSaveVisitor implements Visitor {

    private JSONArray objects = new JSONArray();
    @Override
    public void visitBook(Book book) {
        JSONObject jo = new JSONObject();
        jo.put("type", book.getClass().getName());
        jo.put("title", book.getTitle());
        JSONArray authors = new JSONArray();
        for(Author author : book.getAuthors()){
            JSONObject authJo = new JSONObject();
            authJo.put("type", author.getClass().getName());
            authJo.put("name", author.getName());
            authors.put(authJo);
        }
        jo.put("authors", authors);
        objects.put(jo);
        for(Element child : book.getChildren()){
            try {
                Visitee visitee = (Visitee)child;
                visitee.accept(this);
            }
            catch (Error error){
                return;
            }
        }
    }

    @Override
    public void visitSection(Section section) {
        JSONObject jo = new JSONObject();
        jo.put("type", section.getClass().getName());
        jo.put("title", section.getTitle());
        objects.put(jo);
        for(Element child : section.getChildren()){
            try {
                Visitee visitee = (Visitee)child;
                visitee.accept(this);
            }
            catch (Error error){
                return;
            }
        }
    }

    @Override
    public void visitTable(Table table) {
        JSONObject jo = new JSONObject();
        jo.put("type", table.getClass().getName());
        jo.put("title", table.getTitle());
        jo.put("parent", ((Section)(table.getParent())).getTitle());
        objects.put(jo);
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        JSONObject jo = new JSONObject();
        jo.put("type", paragraph.getClass().getName());
        jo.put("text", paragraph.getText());
        String alignmentName = "";
        if(paragraph.getTextAlignment() != null){
            alignmentName = paragraph.getTextAlignment().name();
        }
        jo.put("alignment", alignmentName);
        jo.put("parent", ((Section)(paragraph.getParent())).getTitle());
        objects.put(jo);
    }

    @Override
    public void visitImage(Image image) {
        JSONObject jo = new JSONObject();
        jo.put("type", image.getClass().getName());
        jo.put("dim", image.dim());
        jo.put("url", image.url());
        jo.put("parent", ((Section)(image.getParent())).getTitle());
        objects.put(jo);
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        JSONObject jo = new JSONObject();
        jo.put("type", imageProxy.getClass().getName());
        jo.put("dim", imageProxy.dim());
        jo.put("url", imageProxy.url());
        jo.put("parent", ((Section)(imageProxy.getParent())).getTitle());
        objects.put(jo);
    }

    @Override
    public void visitTableOfContents(TableOfContents table) {
        JSONObject jo = new JSONObject();
        jo.put("type", table.getClass().getName());
        jo.put("content", table.getSomething());
        jo.put("parent", ((Section)(table.getParent())).getTitle());
        objects.put(jo);
    }

    public void printJSON() {
        System.out.println(objects.toString());
    }
}
