package com.mall.mapper;

import com.mall.model.YlgjMallCarType;

public interface YlgjMallCarTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallCarType record);

    int insertSelective(YlgjMallCarType record);

    YlgjMallCarType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallCarType record);

    int updateByPrimaryKey(YlgjMallCarType record);
}