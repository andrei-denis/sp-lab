package ro.uvt.services;

import ro.uvt.models.ImageContent;

public interface ImageLoader {
    ImageContent load(String path);
}
