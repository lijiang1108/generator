package com.lijiang.generator.mapper;

import com.lijiang.generator.bean.YlgjMallCarBrand;

public interface YlgjMallCarBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallCarBrand record);

    int insertSelective(YlgjMallCarBrand record);

    YlgjMallCarBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallCarBrand record);

    int updateByPrimaryKey(YlgjMallCarBrand record);
}