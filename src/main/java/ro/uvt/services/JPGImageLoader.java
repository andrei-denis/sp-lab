package ro.uvt.services;

import ij.IJ;
import ro.uvt.models.ImageContent;

public class JPGImageLoader implements ImageLoader {
    @Override
    public ImageContent load(String path) {
        return new ImageContent(IJ.openImage(path));
    }
}
