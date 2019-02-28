package com.mall.model;

import java.util.Date;

public class YlgjMallDealer {
    private Integer id;

    private String dealerName;

    private String contact;

    private String dealerTel;

    private String province;

    private String city;

    private String county;

    private String detailedAddress;

    private String discountIntroduce;

    private Byte type;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getDealerTel() {
        return dealerTel;
    }

    public void setDealerTel(String dealerTel) {
        this.dealerTel = dealerTel == null ? null : dealerTel.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
    }

    public String getDiscountIntroduce() {
        return discountIntroduce;
    }

    public void setDiscountIntroduce(String discountIntroduce) {
        this.discountIntroduce = discountIntroduce == null ? null : discountIntroduce.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}