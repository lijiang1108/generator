package com.mall.model;

import java.util.Date;

public class YlgjMallDealerCartype {
    private Integer id;

    private Integer cartypeId;

    private Integer dealerId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCartypeId() {
        return cartypeId;
    }

    public void setCartypeId(Integer cartypeId) {
        this.cartypeId = cartypeId;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}