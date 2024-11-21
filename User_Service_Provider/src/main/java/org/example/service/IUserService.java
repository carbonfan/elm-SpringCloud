package org.example.service;

import com.comm.pojo.User;

public interface IUserService {
    User getUserByIdByPass(String Id, String pw);
    Integer getUserById(String Id);
    Integer saveUser(User user);
    Integer setToken(User user);
}
