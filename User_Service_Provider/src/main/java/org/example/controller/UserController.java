package org.example.controller;

import com.comm.pojo.User;
import com.comm.utils.JWTUtils;
import jakarta.annotation.Resource;
import org.example.service.IUserService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
@RefreshScope
public class UserController {
    @Resource
    private IUserService userService;
    @PostMapping("/login")
    public User getUserByIdByPass(@RequestParam String userId, @RequestParam String password){
        if(userService.getUserByIdByPass(userId,password) != null){
            User user = userService.getUserByIdByPass(userId,password);
            user.setToken(JWTUtils.createToken(userId,password));
            userService.setToken(user);
            return userService.getUserByIdByPass(userId,password);
        }else {
            return null;
        }
    }
    @GetMapping("/getUserById")
    public int getUserById(@RequestParam String userId){
        return userService.getUserById(userId);
    }
    @PostMapping("/saveUser")
    public int saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
