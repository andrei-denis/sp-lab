package ro.uvt.models;

import ro.uvt.models.Element;

public abstract class AbstractElement implements Element {

    protected Element parent = null;

    @Override
    public void add(Element el){
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element el){
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int index){
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasParent(){
        return (parent != null);
    }

    @Override
    public void setParent(Element el){
        parent = el;
    }

    public Element getParent(){
        return this.parent;
    }
}
