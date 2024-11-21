package org.example.controller;

import com.comm.pojo.User;
import jakarta.annotation.Resource;
import org.example.service.IUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    @PostMapping("/login")
    public User getUserByIdByPass(@RequestParam("userId") String userId, @RequestParam("password") String password){
        return userService.getUserByIdByPass(userId,password);
    }
    @GetMapping("/getUserById")
    public int getUserById(@RequestParam("userId") String userId){
        return userService.getUserById(userId);
    }
    @PostMapping("/saveUser")
    public int saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
