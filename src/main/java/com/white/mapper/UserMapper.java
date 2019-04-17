package com.white.mapper;

import com.white.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    @Select("select * from mymanage_user where id = #{id}")
    User selectById(@Param("id") int id);
}