package ro.uvt.info.sp;

public interface Element {
    void print();

    void add(Element el);
    void remove(Element el);
    Element get(int index);

    boolean hasParent();

    void setParent(Element el);
}
