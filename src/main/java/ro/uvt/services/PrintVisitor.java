package ro.uvt.services;

import ro.uvt.models.*;

public class PrintVisitor implements Visitor {

    @Override
    public void visitStudent(Student student) {
        System.out.println("            " + student.getNume() + ", " + student.getEmail());
    }

    @Override
    public void visitAn(An an) {
        System.out.println(an.getNume());
        for(Element child : an.getChildren()){
            ((Visitee)child).accept(this);
        }
    }

    @Override
    public void visitGrupa(Grupa grupa) {
        System.out.println("    " + grupa.getNume());
        for(Element child : grupa.getChildren()){
            ((Visitee)child).accept(this);
        }
    }

    @Override
    public void visitSemigrupa(Semigrupa semigrupa) {
        System.out.println("        " + semigrupa.getNume());
        for(Element child : semigrupa.getChildren()){
            ((Visitee)child).accept(this);
        }
    }
}
