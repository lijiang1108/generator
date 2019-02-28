package com.mall.mapper;

import com.mall.model.YlgjMallCarBrand;

public interface YlgjMallCarBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallCarBrand record);

    int insertSelective(YlgjMallCarBrand record);

    YlgjMallCarBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallCarBrand record);

    int updateByPrimaryKey(YlgjMallCarBrand record);
}