package org.example.service.Impl;

import com.comm.dao.IUserMapper;
import com.comm.pojo.User;
import jakarta.annotation.Resource;
import org.example.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Resource
    private IUserMapper userMapper;
    @Override
    public User getUserByIdByPass(String userId, String pw){
        return userMapper.getUserByIdByPass(userId,pw);
    }
    @Override
    public Integer getUserById(String Id){
        return userMapper.getUserById(Id);
    }
    @Override
    public Integer saveUser(User user){
        return userMapper.saveUser(user);
    }
    @Override
    public Integer setToken(User user){
        return userMapper.setToken(user);
    }
}
