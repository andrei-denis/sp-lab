package ro.uvt.info.sp;

public class Image implements Element {
    private final String imageName;

    public Image(String im){
        this.imageName = im;
    }

    @Override
    public void print() {
        System.out.println("Image with name:" + this.imageName);
    }
}
