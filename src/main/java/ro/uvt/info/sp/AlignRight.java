package ro.uvt.info.sp;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(String text, Context context) {
        while (text.length() > context.getMaxRowChar()){
            String line = text.substring(0, context.getMaxRowChar());
            text = text.substring(context.getMaxRowChar());
            System.out.println(line);
        }
        for (int i = 0; i< context.getMaxRowChar() - text.length(); i++){
            System.out.print(" ");
        }
        System.out.println(text);
    }
}
