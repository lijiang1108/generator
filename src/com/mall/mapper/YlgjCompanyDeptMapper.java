package com.mall.mapper;

import com.mall.model.YlgjCompanyDept;

public interface YlgjCompanyDeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjCompanyDept record);

    int insertSelective(YlgjCompanyDept record);

    YlgjCompanyDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjCompanyDept record);

    int updateByPrimaryKey(YlgjCompanyDept record);
}