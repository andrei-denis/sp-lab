package ro.uvt.models;

public class Author {
    private final String name;

    public Author(String fullName){
        this.name = fullName;
    }

    public String getName() {
        return name;
    }
}
