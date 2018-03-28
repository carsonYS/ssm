package com.my.hello.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.my.hello.pojo.User;

@Mapper  
@Repository
public interface UserMapper {
    User selectByPrimaryKey(Integer id);

}