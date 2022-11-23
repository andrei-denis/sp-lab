package ro.uvt.models;

public class An extends AbstractElement implements Visitee {

    public An(String nume) {
        super(nume);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAn(this);
    }
}
