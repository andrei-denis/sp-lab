package ro.uvt.models;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractElement implements Element {
    protected final String nume;
    protected List<Element> children;

    public String getNume() {
        return nume;
    }

    public List<Element> getChildren() {
        return children;
    }

    protected AbstractElement(String nume) {
        this.nume = nume;
        this.children = new ArrayList<Element>();
    }

    @Override
    public Element add(Element element) {
        this.children.add(element);
        return this;
    }

}
