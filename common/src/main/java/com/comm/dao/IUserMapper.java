package com.comm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comm.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IUserMapper extends BaseMapper<User> {
    User getUserByIdByPass(@Param("userId")String Id,@Param("password") String pw);
    Integer getUserById(String Id);
    Integer saveUser(User user);
    Integer setToken(User user);
}
