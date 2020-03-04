package com.clock.dao;

import com.clock.entity.Corresponding;

import java.util.List;

public interface CorrespondingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Corresponding record);

    int insertSelective(Corresponding record);

    Corresponding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Corresponding record);

    int updateByPrimaryKey(Corresponding record);

    List<Corresponding> getAllCorresponding();
}