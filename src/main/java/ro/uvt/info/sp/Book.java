package ro.uvt.info.sp;

import java.util.List;
import java.util.ArrayList;

public class Book extends Section {
    private final List<Author> authors;

    public Book(String t){
        super(t);
        authors = new ArrayList<Author>();
    }

    public void addAuthor(Author a){
        this.authors.add(a);
    }

    public void addContent(AbstractElement el) {
        super.add(el);
    }

    @Override
    public void print(){
        System.out.println("Book: " + this.title + "\n");
        System.out.println("Authors:");
        for(Author author : this.authors){
            author.print();
        }
        System.out.println();
        for(Element child : children){
            child.print();
        }
    }

}
