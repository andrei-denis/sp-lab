package ro.uvt.services;

import org.apache.commons.io.FilenameUtils;

public class ImageLoaderFactory {

    public static ImageLoader create(String filename){
        String imageType = FilenameUtils.getExtension(filename);
        switch (imageType){
            case "bmp":
                return new BMPImageLoader();
            case "jpg":
                return new JPGImageLoader();
            default:
                System.out.println("Unsupported image type");
                break;
        }
        return  null;
    }
}
