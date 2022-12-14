package ro.uvt.models;

import lombok.Value;


public class Table extends AbstractElement implements Visitee {
    private final String title;

    public Table(String t){
        this.title = t;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

    public String getTitle() {
        return title;
    }
}
