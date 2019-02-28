package com.lijiang.generator.mapper;

import com.lijiang.generator.bean.YlgjMallConsultMessage;

public interface YlgjMallConsultMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YlgjMallConsultMessage record);

    int insertSelective(YlgjMallConsultMessage record);

    YlgjMallConsultMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YlgjMallConsultMessage record);

    int updateByPrimaryKey(YlgjMallConsultMessage record);
}