package ro.uvt.info.sp;

import ij.IJ;

public class JPGImageLoader implements ImageLoader{
    @Override
    public ImageContent load(String path) {
        return new ImageContent(IJ.openImage(path));
    }
}
