package ro.uvt.info.sp;

public class Table implements Element{
    private String title;

    public Table(String t){
        this.title = t;
    }

    @Override
    public void print(){
        System.out.println("Table with title: " + this.title);
    }
}
