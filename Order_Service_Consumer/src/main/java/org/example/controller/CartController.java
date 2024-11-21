package org.example.controller;


import com.comm.pojo.Cart;
import jakarta.annotation.Resource;
import org.example.service.ICartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Resource
    private ICartService cartService;
    @PostMapping("/getList")
    public List<Cart> listCart(@RequestBody Cart cart){
        return cartService.listCart(cart);
    }
    @PostMapping("/save")
    public int saveCart(@RequestBody Cart cart){
        return cartService.saveCart(cart);
    }
    @PutMapping("/update")
    public int updateCart(@RequestBody Cart cart){
        return cartService.updateCart(cart);
    }
    @DeleteMapping("/remove")
    public int removeCart(@RequestBody Cart cart){
        return cartService.removeCart(cart);
    }
}
