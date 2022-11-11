package ro.uvt.services;

import ro.uvt.models.Context;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(String text, Context context) {
        while (text.length() > context.getMaxRowChar()){
            String line = text.substring(0, context.getMaxRowChar());
            text = text.substring(context.getMaxRowChar());
            System.out.println(line);
        }
        
        for (int i = 0; i< (context.getMaxRowChar() - text.length())/2; i++){
            System.out.print(" ");
        }
        System.out.println(text);
    }

    @Override
    public String name() {
        return "AlignCenter";
    }
}
