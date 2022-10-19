package ro.uvt.info.sp;

import java.util.List;
import java.util.ArrayList;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;
    public Chapter(String n){
        this.name = n;
        subChapters = new ArrayList<SubChapter>();
    }

    public int createSubChapter(String nameSubChapter) {
        subChapters.add(new SubChapter(nameSubChapter));
        return (subChapters.size() - 1);
    }

    public SubChapter getSubChapter(int indexSubChapter) {
        return subChapters.get(indexSubChapter);
    }

    public void print(){
        for(SubChapter subChapter : subChapters){
            subChapter.print();
        }
    }
}
