package ro.uvt.services;

import ro.uvt.models.*;

public class RenderContentVisitor implements Visitor {
    @Override
    public void visitBook(Book book) {
        System.out.println("Book: " + book.getTitle() + "\n");
        System.out.println("Authors:");
        for(Author author : book.getAuthors()){
            System.out.println("Author: " + author.getName());
        }
        System.out.println();
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
        System.out.println(section.getTitle());
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
        System.out.println(table.getTitle());
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        if(paragraph.getTextAlignment() == null){
            System.out.println(paragraph.getText());
        }
        else {
            paragraph.getTextAlignment().render(paragraph.getText(), new Context());
        }
    }

    @Override
    public void visitImage(Image image) {
        System.out.println("Image with name:" + image.url());
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.loadImage().accept(this);
    }

    @Override
    public void visitTableOfContents(TableOfContents table) {
        System.out.println(table.getSomething());
    }
}
