package ro.uvt.models;

import ro.uvt.models.AbstractElement;

public class TableOfContents extends AbstractElement implements Visitee {

    private final String something = "TableOfContents";

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

    public String getSomething() {
        return something;
    }
}
