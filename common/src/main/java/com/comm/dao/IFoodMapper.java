package com.comm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comm.pojo.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IFoodMapper extends BaseMapper<Food> {
    List<Food> listFoodByBusinessId(String bussId);
    Food getFoodById(String foodId);
}
