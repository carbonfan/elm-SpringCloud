package org.example.service;

import com.comm.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user-service-provider")
public interface IUserService {
    @PostMapping("/user/login")
    public User getUserByIdByPass(@RequestParam("userId") String userId, @RequestParam("password") String password);
    @GetMapping("/user/getUserById")
    public int getUserById(@RequestParam("userId") String userId);
    @PostMapping("/user/saveUser")
    public int saveUser(@RequestBody User user);
}
