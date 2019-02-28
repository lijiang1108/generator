package com.lijiang.generator.mapper;

import com.lijiang.generator.bean.YlgjMallDealer;

public interface YlgjMallDealerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallDealer record);

    int insertSelective(YlgjMallDealer record);

    YlgjMallDealer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallDealer record);

    int updateByPrimaryKey(YlgjMallDealer record);
}