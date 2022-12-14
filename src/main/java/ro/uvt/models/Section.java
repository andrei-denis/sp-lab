package ro.uvt.models;

import java.util.List;
import java.util.ArrayList;

public class Section extends AbstractElement implements Visitee{
    protected final String title;
    protected final List<Element> children;

    public Section(String t){
        this.title = t;
        children = new ArrayList<Element>();
    }

    @Override
    public void add(Element el) {
        if(el.hasParent() || el == this){
            throw new UnsupportedOperationException();
        }

        children.add(el);
        el.setParent(this);
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
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

    public String getTitle(){
        return this.title;
    }

    public List<Element> getChildren() {
        return children;
    }
}
