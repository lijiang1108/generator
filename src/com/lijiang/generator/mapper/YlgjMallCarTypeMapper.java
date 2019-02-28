package com.lijiang.generator.mapper;

import com.lijiang.generator.bean.YlgjMallCarType;

public interface YlgjMallCarTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallCarType record);

    int insertSelective(YlgjMallCarType record);

    YlgjMallCarType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallCarType record);

    int updateByPrimaryKey(YlgjMallCarType record);
}