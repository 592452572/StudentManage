package com.white.mapper;

import com.white.model.School;

public interface SchoolMapper {
    int insert(School record);

    int insertSelective(School record);
}