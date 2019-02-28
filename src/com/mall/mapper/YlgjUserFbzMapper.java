package com.mall.mapper;

import com.mall.model.YlgjUserFbz;

public interface YlgjUserFbzMapper {
    int deleteByPrimaryKey(String id);

    int insert(YlgjUserFbz record);

    int insertSelective(YlgjUserFbz record);

    YlgjUserFbz selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(YlgjUserFbz record);

    int updateByPrimaryKey(YlgjUserFbz record);
}