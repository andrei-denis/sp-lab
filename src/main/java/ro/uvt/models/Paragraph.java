package ro.uvt.models;

import ro.uvt.services.AlignStrategy;

public class Paragraph extends AbstractElement implements Visitee{
    private final String text;
    private AlignStrategy textAlignment = null;

    public Paragraph(String t){
        this.text = t;
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.textAlignment = strategy;
    }

    public AlignStrategy getTextAlignment(){
        return textAlignment;
    }

    public String getText(){
        return ("Paragraph: " + this.text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
