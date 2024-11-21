package org.example.service;

import com.comm.pojo.Food;

import java.util.List;

public interface IFoodService {
    List<Food> listFoodByBusinessId(String bussId);
    Food getFoodById(String foodId);
}
