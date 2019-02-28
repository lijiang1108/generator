package com.mall.mapper;

import com.mall.model.YlgjMallTemplate;

public interface YlgjMallTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallTemplate record);

    int insertSelective(YlgjMallTemplate record);

    YlgjMallTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallTemplate record);

    int updateByPrimaryKey(YlgjMallTemplate record);
}