package org.example.service;

import com.comm.pojo.Cart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("order-service-provider")
public interface ICartService {
    @PostMapping("/cart/getList")
    public List<Cart> listCart(@RequestBody Cart cart);
    @PostMapping("/cart/save")
    public int saveCart(@RequestBody Cart cart);
    @PutMapping("/cart/update")
    public int updateCart(@RequestBody Cart cart);
    @DeleteMapping("/cart/remove")
    public int removeCart(@RequestBody Cart cart);
}
