package com.mall.model;

public class YlgjMallAdvertisementPartment {
    private Integer id;

    private String partmentName;

    private Byte appType;

    private Byte state;

    private Byte managerLevel;

    private String picture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartmentName() {
        return partmentName;
    }

    public void setPartmentName(String partmentName) {
        this.partmentName = partmentName == null ? null : partmentName.trim();
    }

    public Byte getAppType() {
        return appType;
    }

    public void setAppType(Byte appType) {
        this.appType = appType;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getManagerLevel() {
        return managerLevel;
    }

    public void setManagerLevel(Byte managerLevel) {
        this.managerLevel = managerLevel;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}