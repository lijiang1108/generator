package com.mall.model;

import java.util.Date;

public class YlgjMallCarType {
    private Integer id;

    private Integer carBrandId;

    private String carTypeName;

    private String carTypeThumbnail;

    private String describes;

    private String guidancePrice;

    private String drivingForm;

    private String maxPower;

    private String carLoad;

    private String emissionStandard;

    private String carEngine;

    private String pictures;

    private Byte state;

    private Byte ifHit;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName == null ? null : carTypeName.trim();
    }

    public String getCarTypeThumbnail() {
        return carTypeThumbnail;
    }

    public void setCarTypeThumbnail(String carTypeThumbnail) {
        this.carTypeThumbnail = carTypeThumbnail == null ? null : carTypeThumbnail.trim();
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes == null ? null : describes.trim();
    }

    public String getGuidancePrice() {
        return guidancePrice;
    }

    public void setGuidancePrice(String guidancePrice) {
        this.guidancePrice = guidancePrice == null ? null : guidancePrice.trim();
    }

    public String getDrivingForm() {
        return drivingForm;
    }

    public void setDrivingForm(String drivingForm) {
        this.drivingForm = drivingForm == null ? null : drivingForm.trim();
    }

    public String getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(String maxPower) {
        this.maxPower = maxPower == null ? null : maxPower.trim();
    }

    public String getCarLoad() {
        return carLoad;
    }

    public void setCarLoad(String carLoad) {
        this.carLoad = carLoad == null ? null : carLoad.trim();
    }

    public String getEmissionStandard() {
        return emissionStandard;
    }

    public void setEmissionStandard(String emissionStandard) {
        this.emissionStandard = emissionStandard == null ? null : emissionStandard.trim();
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine == null ? null : carEngine.trim();
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures == null ? null : pictures.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getIfHit() {
        return ifHit;
    }

    public void setIfHit(Byte ifHit) {
        this.ifHit = ifHit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}