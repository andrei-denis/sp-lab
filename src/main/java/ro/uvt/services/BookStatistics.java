package ro.uvt.services;

import ro.uvt.info.sp.Main;
import ro.uvt.models.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookStatistics implements Visitor {

    private Map<String, Integer> stats = new HashMap<String, Integer>();

    @Override
    public void visitBook(Book book) {
        stats.merge("authors", book.getAuthors().size(), Integer::sum);
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
        stats.merge("tables", 1, Integer::sum);
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        stats.merge("paragraphs", 1, Integer::sum);
    }

    @Override
    public void visitImage(Image image) {
        stats.merge("images", 1, Integer::sum);
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        stats.merge("images", 1, Integer::sum);
    }

    @Override
    public void visitTableOfContents(TableOfContents table) {
        stats.merge("tables", 1, Integer::sum);
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        for (Map.Entry<String,Integer> entry : stats.entrySet())
            System.out.println("*** Number of " + entry.getKey() + ": " + entry.getValue().toString());
    }
}
