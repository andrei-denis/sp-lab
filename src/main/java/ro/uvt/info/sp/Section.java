package ro.uvt.info.sp;

import java.util.List;
import java.util.ArrayList;

public class Section extends AbstractElement {
    protected final String title;
    protected final List<Element> children;

    public Section(String t){
        this.title = t;
        children = new ArrayList<Element>();
    }

    @Override
    public void print(){
        System.out.println(this.title);
        for(Element child : children){
            child.print();
        }
    }

    @Override
    public void add(Element el) {
        if(el.hasParent() || el == this){
            throw new UnsupportedOperationException();
        }

        children.add(el);
        el.setParent(el);
    }

    @Override
    public void remove(Element el) {
        children.remove(el);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

}
