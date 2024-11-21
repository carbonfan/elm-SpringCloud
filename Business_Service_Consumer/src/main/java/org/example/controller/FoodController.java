package org.example.controller;

import com.comm.pojo.Food;
import jakarta.annotation.Resource;
import org.example.service.IFoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Resource
    private IFoodService foodService;

    @GetMapping("/getList")
    public List<Food> listFoodByBusinessId(@RequestParam("bussId") String bussId) {
        return foodService.listFoodByBusinessId(bussId);
    }
    @GetMapping("/getById")
    public Food getFoodById(@RequestParam("fooodId") String foodId){
        return foodService.getFoodById(foodId);
    }
}
