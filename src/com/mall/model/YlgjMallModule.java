package com.mall.model;

public class YlgjMallModule {
    private Integer id;

    private String moduleName;

    private Integer shopId;

    private Byte shopOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Byte getShopOrder() {
        return shopOrder;
    }

    public void setShopOrder(Byte shopOrder) {
        this.shopOrder = shopOrder;
    }
}