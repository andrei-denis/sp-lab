package ro.uvt.models;

public class Semigrupa extends AbstractElement implements Visitee{

    public Semigrupa(String nume) {
        super(nume);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSemigrupa(this);
    }
}
