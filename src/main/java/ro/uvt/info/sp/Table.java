package ro.uvt.info.sp;

public class Table extends AbstractElement {
    private final String something = "Table";


    @Override
    public void print(){
        System.out.println(something);
    }
}
