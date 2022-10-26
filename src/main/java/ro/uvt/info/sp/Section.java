package ro.uvt.info.sp;

import java.util.List;
import java.util.ArrayList;

public class Section extends AbstractElement {
    protected final String title;
    protected final List<AbstractElement> children;

    public Section(String t){
        this.title = t;
        children = new ArrayList<AbstractElement>();
    }

    @Override
    public void print(){
        System.out.println(this.title);
        for(AbstractElement child : children){
            child.print();
        }
    }

    @Override
    public void add(AbstractElement el) {
        if(el.hasParent() || el == this){
            throw new UnsupportedOperationException();
        }

        children.add(el);
        el.setParent(el);
    }

    @Override
    public void remove(AbstractElement el) {
        children.remove(el);
    }

    @Override
    public AbstractElement get(int index) {
        return children.get(index);
    }

}
