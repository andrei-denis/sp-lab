package ro.uvt.info.sp;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class ImageProxy extends AbstractElement implements Picture{
    private final String url;
    private  final Dimension dim = new Dimension();
    private Image realImg = null;

    public ImageProxy(String u){
        this.url = u;
    }

    private Image loadImage(){
        if(realImg == null){
            realImg = new Image(this.url());
        }
        return realImg;
    }

    @Override
    public void print() {
        this.loadImage().print();
    }

    @Override
    public String url() {
        return this.url;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }

    @Override
    public ImageContent content() {
        return this.realImg.content();
    }
}
