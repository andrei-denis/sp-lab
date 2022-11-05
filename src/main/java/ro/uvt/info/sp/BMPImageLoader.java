package ro.uvt.info.sp;

public class BMPImageLoader implements ImageLoader{
    @Override
    public ImageContent load(String path) {
        return new ImageContent(path);
    }
}
