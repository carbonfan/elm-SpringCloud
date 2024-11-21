package org.example.service;

import com.comm.pojo.Food;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("business-service-provider")
public interface IFoodService {
    @GetMapping("/food/getList")
    public List<Food> listFoodByBusinessId(@RequestParam("bussId") String bussId);
    @GetMapping("/food/getById")
    public Food getFoodById(@RequestParam("foodId") String foodId);
}
