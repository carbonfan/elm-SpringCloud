package org.example.service;

import com.comm.pojo.Cart;

import java.util.List;

public interface ICartService {
    List<Cart> listCart(Cart cart);
    //向购物车表中添加一条记录
    int saveCart(Cart cart);
    //根据用户编号、商家编号、食品编号更新数量
    int updateCart(Cart cart);
    int removeCart(Cart cart);
}
