package com.clock.dao;

import com.clock.entity.Basestudents;
import com.clock.entity.Corresponding;

import java.util.List;

public interface BasestudentsMapper {
    int deleteByPrimaryKey(String studentname);

    int insert(Basestudents record);

    int insertSelective(Basestudents record);

    List<String> getAllStudentName();

}