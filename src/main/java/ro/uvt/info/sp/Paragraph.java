package ro.uvt.info.sp;

public class Paragraph {
    private String text;

    public Paragraph(String t){
        this.text = t;
    }

    public void print() {
        System.out.println(this.text);
    }
}
