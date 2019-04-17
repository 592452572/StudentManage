package com.white.mapper;

import com.white.model.Competition;

public interface CompetitionMapper {
    int insert(Competition record);

    int insertSelective(Competition record);
}