package ro.uvt.info.sp;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image extends AbstractElement implements Picture{
    private final String url;
    private ImageContent content;


    public Image(String u){
        this.url = u;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image with name:" + this.url);
        this.content().display();
    }

    @Override
    public String url() {
        return this.url;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public ImageContent content() {
        if(this.content == null){
            ImageLoader loader = ImageLoaderFactory.create(this.url);
            this.content = loader.load(this.url);
        }
        return this.content;
    }
}
