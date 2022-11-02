package ro.uvt.info.sp;

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
}
