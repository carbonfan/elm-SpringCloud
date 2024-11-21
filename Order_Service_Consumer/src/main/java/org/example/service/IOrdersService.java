package org.example.service;

import com.comm.pojo.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("order-service-provider")
public interface IOrdersService {
    @PostMapping("/orders/createOrders")
    public String createOrders(@RequestBody Orders orders);
    @GetMapping("/orders/getById")
    public Orders getOrdersById(@RequestParam("orId") String orId);
    @GetMapping("/orders/getByUserId")
    public List<Orders> listOrdersByUserId(@RequestParam("userId") String userId);
    @PutMapping("/orders/updateState")
    public int updateState(@RequestBody Orders order);
}
