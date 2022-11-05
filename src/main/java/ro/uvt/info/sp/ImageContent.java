package ro.uvt.info.sp;

import ij.IJ;
import ij.ImagePlus;
import lombok.Value;

@Value
public class ImageContent {
    ImagePlus content;

    public ImageContent(String imageName){
        this.content = IJ.openImage(imageName);
    }

    public void display(){
        if(content != null){
            this.content.show();
        }
        System.out.println("Image doesn't exist");
    }
}
