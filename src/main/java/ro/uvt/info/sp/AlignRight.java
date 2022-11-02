package ro.uvt.info.sp;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(String text, Context context) {
        while (text.length() > context.maxRowChar){
            String line = text.substring(0, context.maxRowChar);
            text.replace(line, "");
            System.out.println(line);
        }
        for (int i=0; i< context.maxRowChar - text.length(); i++){
            System.out.print(" ");
        }
        System.out.println(text);
    }
}
