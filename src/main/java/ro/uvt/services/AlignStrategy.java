package ro.uvt.services;

import ro.uvt.models.Context;

public interface AlignStrategy {
    void render(String text, Context context);

    String name();
}
