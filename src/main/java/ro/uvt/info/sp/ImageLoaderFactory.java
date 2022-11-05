package ro.uvt.info.sp;

import org.apache.commons.io.FilenameUtils;

public class ImageLoaderFactory {

    public static ImageContent create(String filename){
        String imageType = FilenameUtils.getExtension(filename);
        switch (imageType){
            case "bmp":
                return new BMPImageLoader().load(filename);
            case "jpg":
                return new JPGImageLoader().load(filename);
            default:
                System.out.println("Unsupported image type");
                break;
        }
        return  null;
    }
}
