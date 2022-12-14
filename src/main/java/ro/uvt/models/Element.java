package ro.uvt.models;

public interface Element {

    void add(Element el);
    void remove(Element el);
    Element get(int index);

    boolean hasParent();

    void setParent(Element el);
}
