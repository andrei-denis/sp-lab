package ro.uvt.models;

import java.awt.*;

public class ImageProxy extends AbstractElement implements Picture, Visitee {
    private final String url;
    private  final Dimension dim = new Dimension();
    private Image realImg = null;

    public ImageProxy(String u){
        this.url = u;
    }

    public Image loadImage(){
        if(realImg == null){
            realImg = new Image(this.url());
        }
        return realImg;
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
