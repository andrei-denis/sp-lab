package ro.uvt.info.sp;

import java.util.ArrayList;

public class Book {
    private String title;
    private Author author;
    private ArrayList<Chapter> chapters;

    public Book(String t){
        this.title = t;
        chapters = new ArrayList<Chapter>();
    }

    public void addAuthor(Author a){
        this.author = a;
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
