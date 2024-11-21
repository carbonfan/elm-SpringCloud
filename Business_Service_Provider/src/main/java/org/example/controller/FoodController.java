package org.example.controller;

import com.comm.pojo.Food;
import jakarta.annotation.Resource;
import org.example.service.IFoodService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
@CrossOrigin("*")
@RefreshScope
public class FoodController {
    @Resource
    private IFoodService foodService;

    @GetMapping("/getList")
    public List<Food> listFoodByBusinessId(String bussId) {
        return foodService.listFoodByBusinessId(bussId);
    }
    @GetMapping("/getById")
    public Food getFoodById(String foodId){
        return foodService.getFoodById(foodId);
    }
}
