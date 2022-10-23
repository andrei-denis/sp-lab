package ro.uvt.info.sp;

public class Table implements Element{
    private final String something = "Table";


    @Override
    public void print(){
        System.out.println(something);
    }
}
