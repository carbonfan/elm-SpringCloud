package org.example.service.Impl;

import com.comm.dao.ICartMapper;
import com.comm.pojo.Cart;
import jakarta.annotation.Resource;
import org.example.service.ICartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements ICartService {
    @Resource
    private ICartMapper cartMapper;
    @Override
    public List<Cart> listCart(Cart cart){
        return cartMapper.listCart(cart);
    }
    @Override
    public int saveCart(Cart cart){
        return cartMapper.saveCart(cart);
    }
    @Override
    public int updateCart(Cart cart){
        return cartMapper.updateCart(cart);
    }
    @Override
    public int removeCart(Cart cart){
        return cartMapper.removeCart(cart);
    }
}
