package ro.uvt.models;

import ro.uvt.models.ImageContent;

import java.awt.*;

public interface Picture {
    String url();

    Dimension dim();

    ImageContent content();
}
