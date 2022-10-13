package ro.uvt.info.sp;

public class Table {
    private String title;

    public Table(String t){
        this.title = t;
    }

    public void print(){
        System.out.println(this.title);
    }
}
