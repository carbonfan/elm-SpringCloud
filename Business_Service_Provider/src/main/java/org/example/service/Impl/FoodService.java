package org.example.service.Impl;

import com.comm.dao.IFoodMapper;
import com.comm.pojo.Food;
import jakarta.annotation.Resource;
import org.example.service.IFoodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService implements IFoodService {
    @Resource
    private IFoodMapper foodMapper;
    @Override
    public List<Food> listFoodByBusinessId(String bussId){
        return foodMapper.listFoodByBusinessId(bussId);
    }
    @Override
    public Food getFoodById(String foodId){
        return foodMapper.getFoodById(foodId);
    }
}
