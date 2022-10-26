package ro.uvt.info.sp;

public abstract class AbstractElement implements Element {

    protected AbstractElement parent = null;

    public void add(AbstractElement el){
        throw new UnsupportedOperationException();
    }

    public void remove(AbstractElement el){
        throw new UnsupportedOperationException();
    }
    public AbstractElement get(int index){
        throw new UnsupportedOperationException();
    }

    public boolean hasParent(){
        return (parent != null);
    }

    public void setParent(AbstractElement el){
        parent = el;
    }
}
