package ro.uvt.models;

public class Student implements Element, Visitee{
    private final String nume;
    private final  String email;

    public Student(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }

    @Override
    public Element add(Element element) {
        throw new UnsupportedOperationException();
    }
}
