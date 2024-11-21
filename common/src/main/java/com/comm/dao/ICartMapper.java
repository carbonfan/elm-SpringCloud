package com.comm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comm.pojo.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICartMapper extends BaseMapper<Cart> {
    //根据用户编号查询此用户所有购物车信息
    //根据用户编号和商家编号，查询此用户购物车中某个商家的所有购物车信息
    List<Cart> listCart(Cart cart);
    //向购物车表中添加一条记录
    int saveCart(Cart cart);
    //根据用户编号、商家编号、食品编号更新数量
    int updateCart(Cart cart);
    int removeCart(Cart cart);
}
