package ro.uvt.info.sp;

public class AlignLeft implements AlignStrategy{
    @Override
    public void render(String text, Context context) {
        while (text.length() > context.maxRowChar){
            String line = text.substring(0, context.maxRowChar);
            text.replace(line, "");
            System.out.println(line);
        }
        System.out.println(text);
    }
}
