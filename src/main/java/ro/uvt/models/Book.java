package ro.uvt.models;

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
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
