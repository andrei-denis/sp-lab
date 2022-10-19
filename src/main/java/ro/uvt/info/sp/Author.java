package ro.uvt.info.sp;

public class Author {
    private String name;

    public Author(String n){
        this.name = n;
    }

    public void print(){
        System.out.println(this.name);
    }
}
