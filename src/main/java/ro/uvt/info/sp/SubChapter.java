package ro.uvt.info.sp;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> paragraphs;
    private List<Image> images;
    private List<Table> tables;

    public SubChapter(String n){
        this.name = n;
        paragraphs = new ArrayList<Paragraph>();
        images = new ArrayList<Image>();
        tables = new ArrayList<Table>();
    }

    public void createNewParagraph(String text) {
        paragraphs.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        images.add(new Image(imageName));
    }

    public void createNewTable(String tableName) {
        tables.add(new Table(tableName));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for(Paragraph paragraph : paragraphs){
            System.out.print("Paragraph: ");
            paragraph.print();
        }

        for(Image image : images){
            System.out.print("Image with name:");
            image.print();
        }

        for(Table table : tables){
            System.out.print("Table with title: ");
            table.print();
        }
    }
}
