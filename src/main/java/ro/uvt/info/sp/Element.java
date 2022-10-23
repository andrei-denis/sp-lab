package ro.uvt.info.sp;

public interface Element {
    void print();

    default void add(Element el){
        throw new UnsupportedOperationException();
    }
    default void remove(Element el){
        throw new UnsupportedOperationException();
    }
    default Element get(int index){
        throw new UnsupportedOperationException();
    }

    default boolean containChild(Element child){
        return false;
    }
}
