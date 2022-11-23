package ro.uvt.models;

public interface Visitor {
    void visitStudent(Student student);

    void visitAn(An an);

    void visitGrupa(Grupa grupa);

    void  visitSemigrupa(Semigrupa semigrupa);
}
