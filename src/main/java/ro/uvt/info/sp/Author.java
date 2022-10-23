package ro.uvt.info.sp;

public class Author {
    private final String name;
    private final String surname;

    public Author(String fullName){
        this.surname = fullName.substring(fullName.lastIndexOf('-') + 1);
        this.name = fullName.replace(this.surname, "");
    }

    public void print(){
        System.out.println("Author: " + this.name + this.surname);
    }
}
