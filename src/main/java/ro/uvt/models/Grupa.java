package ro.uvt.models;

public class Grupa extends AbstractElement implements Visitee {

    public Grupa(String nume) {
        super(nume);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
    }
}
