package com.mall.mapper;

import com.mall.model.SsdUserCyz;

public interface SsdUserCyzMapper {
    int deleteByPrimaryKey(String id);

    int insert(SsdUserCyz record);

    int insertSelective(SsdUserCyz record);

    SsdUserCyz selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SsdUserCyz record);

    int updateByPrimaryKey(SsdUserCyz record);
}