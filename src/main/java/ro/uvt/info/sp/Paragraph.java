package ro.uvt.info.sp;

public class Paragraph extends AbstractElement {
    private final String text;

    public Paragraph(String t){
        this.text = t;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + this.text);
    }
}
