package com.wlm.dao;

import com.wlm.pojo.Memu;

public interface MemuMapper {
    int deleteByPrimaryKey(Integer memuid);

    int insert(Memu record);

    int insertSelective(Memu record);

    Memu selectByPrimaryKey(Integer memuid);

    int updateByPrimaryKeySelective(Memu record);

    int updateByPrimaryKey(Memu record);
}