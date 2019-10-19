package com.bluemsun.entity;

public class Photo {
    private String photoAddress;
    private Integer photoId;
    //图片有可能是question，answer和comment
    private Integer type;
    private Integer belong_Id;
    public String getPhotoAddress() {
        return photoAddress;
    }

    public void setPhotoAddress(String photoAddress) {
        this.photoAddress = photoAddress;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getBelong_Id() {
        return belong_Id;
    }

    public void setBelong_Id(Integer belong_Id) {
        this.belong_Id = belong_Id;
    }
}
