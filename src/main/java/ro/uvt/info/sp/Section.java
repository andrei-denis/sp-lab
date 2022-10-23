package ro.uvt.info.sp;

import java.util.List;
import java.util.ArrayList;

public class Section implements Element {
    protected final String title;
    protected final List<Element> children;

    public Section(String t){
        this.title = t;
        children = new ArrayList<Element>();
    }

    public void print(){
        System.out.println(this.title);
        for(Element child : children){
            child.print();
        }
    }

    @Override
    public void add(Element el) {
        if(this.containChild(el)){
            return;
        }
        children.add(el);
    }

    @Override
    public void remove(Element el) {
        children.remove(el);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

    @Override
    public boolean containChild(Element child){
        if(this.children.contains(child)){
            return true;
        }
        for(Element ch : this.children){
            if(ch.containChild(child)){
                return true;
            }
        }
        return false;
    }
}
