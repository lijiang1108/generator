package com.mall.model;

public class YlgjMallTemplateGoods {
    private Integer id;

    private Integer templateId;

    private Integer goodsId;

    private String goodsPic;

    private Byte goodsOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic == null ? null : goodsPic.trim();
    }

    public Byte getGoodsOrder() {
        return goodsOrder;
    }

    public void setGoodsOrder(Byte goodsOrder) {
        this.goodsOrder = goodsOrder;
    }
}