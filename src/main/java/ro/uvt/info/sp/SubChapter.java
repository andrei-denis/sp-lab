package ro.uvt.info.sp;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements;

    public SubChapter(String n){
        this.name = n;
        elements = new ArrayList<Element>();
    }

    public void createNewParagraph(String text) {
        elements.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        elements.add(new Image(imageName));
    }

    public void createNewTable(String tableName) {
        elements.add(new Table(tableName));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for(Element element : elements){
            element.print();
        }
    }
}
