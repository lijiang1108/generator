package com.lijiang.generator.mapper;

import com.lijiang.generator.bean.YlgjMallDealerCartype;

public interface YlgjMallDealerCartypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallDealerCartype record);

    int insertSelective(YlgjMallDealerCartype record);

    YlgjMallDealerCartype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallDealerCartype record);

    int updateByPrimaryKey(YlgjMallDealerCartype record);
}