package com.mall.mapper;

import com.mall.model.YlgjMallTemplateGoods;

public interface YlgjMallTemplateGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallTemplateGoods record);

    int insertSelective(YlgjMallTemplateGoods record);

    YlgjMallTemplateGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallTemplateGoods record);

    int updateByPrimaryKey(YlgjMallTemplateGoods record);
}