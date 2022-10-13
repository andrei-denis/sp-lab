package ro.uvt.info.sp;

public class Image {
    private String imageName;

    public Image(String im){
        this.imageName = im;
    }

    public void print() {
        System.out.println(this.imageName);
    }
}
