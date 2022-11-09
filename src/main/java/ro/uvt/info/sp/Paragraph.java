package ro.uvt.info.sp;

public class Paragraph extends AbstractElement {
    private final String text;
    private AlignStrategy textAlignment = null;

    public Paragraph(String t){
        this.text = t;
    }

    @Override
    public void print() {
        if(this.textAlignment == null){
            System.out.println(this.getText());
        }
        else {
         this.textAlignment.render(this.getText(), new Context());
        }
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.textAlignment = strategy;
    }

    public String getText(){
        return ("Paragraph: " + this.text);
    }
}
