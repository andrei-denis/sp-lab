package ro.uvt.info.sp;

public class AlignLeft implements AlignStrategy{
    @Override
    public void render(String text, Context context) {
        while (text.length() > context.getMaxRowChar()){
            String line = text.substring(0, context.getMaxRowChar());
            text = text.substring(context.getMaxRowChar());
            System.out.println(line);
        }
        System.out.println(text);
    }
}
