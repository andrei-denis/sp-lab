package ro.uvt.info.sp;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String t){
        this.title = t;
        chapters = new ArrayList<Chapter>();
        authors = new ArrayList<Author>();
    }

    public void addAuthor(Author a){
        this.authors.add(a);
    }

    public int createChapter(String titleChapter) {
        chapters.add(new Chapter(titleChapter));
        return (chapters.size() - 1);
    }

    public Chapter getChapter(int indexChapter) {
        return chapters.get(indexChapter);
    }

    public void print(){
        for(Chapter chapter : chapters){
            chapter.print();
        }
    }
}
