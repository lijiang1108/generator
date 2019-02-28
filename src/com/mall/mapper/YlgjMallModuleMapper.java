package com.mall.mapper;

import com.mall.model.YlgjMallModule;

public interface YlgjMallModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallModule record);

    int insertSelective(YlgjMallModule record);

    YlgjMallModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallModule record);

    int updateByPrimaryKey(YlgjMallModule record);
}