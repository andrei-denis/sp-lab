package ro.uvt.info.sp;

public class Author {
    private final String name;

    public Author(String fullName){
        this.name = fullName;
    }

    public void print(){
        System.out.println("Author: " + this.name);
    }
}
