package com.mall.mapper;

import com.mall.model.YlgjMallAdvertisementPartment;

public interface YlgjMallAdvertisementPartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallAdvertisementPartment record);

    int insertSelective(YlgjMallAdvertisementPartment record);

    YlgjMallAdvertisementPartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallAdvertisementPartment record);

    int updateByPrimaryKey(YlgjMallAdvertisementPartment record);
}