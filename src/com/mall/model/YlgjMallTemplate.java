package com.mall.model;

public class YlgjMallTemplate {
    private Integer id;

    private String templateName;

    private Byte templateType;

    private String templateExpress;

    private Integer shopId;

    private Byte order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public Byte getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Byte templateType) {
        this.templateType = templateType;
    }

    public String getTemplateExpress() {
        return templateExpress;
    }

    public void setTemplateExpress(String templateExpress) {
        this.templateExpress = templateExpress == null ? null : templateExpress.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Byte getOrder() {
        return order;
    }

    public void setOrder(Byte order) {
        this.order = order;
    }
}