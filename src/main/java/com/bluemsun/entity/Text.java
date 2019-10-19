package com.bluemsun.entity;

import java.util.List;

public class Text {
    private String text;
    private List<Photo> photos;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
