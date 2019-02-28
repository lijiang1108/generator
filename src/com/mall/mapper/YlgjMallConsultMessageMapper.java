package com.mall.mapper;

import com.mall.model.YlgjMallConsultMessage;

public interface YlgjMallConsultMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallConsultMessage record);

    int insertSelective(YlgjMallConsultMessage record);

    YlgjMallConsultMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallConsultMessage record);

    int updateByPrimaryKey(YlgjMallConsultMessage record);
}