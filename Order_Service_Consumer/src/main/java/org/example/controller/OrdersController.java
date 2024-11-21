package org.example.controller;


import com.comm.pojo.Orders;
import jakarta.annotation.Resource;
import org.example.service.IOrdersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private IOrdersService ordersService;
    @PostMapping("/createOrders")
    public String createOrders(@RequestBody Orders orders){
        return ordersService.createOrders(orders);
    }
    @GetMapping("/getById")
    public Orders getOrdersById(@RequestParam("orId") String orId){
        return ordersService.getOrdersById(orId);
    }
    @GetMapping("/getByUserId")
    public List<Orders> listOrdersByUserId(@RequestParam("userId") String userId){
        return ordersService.listOrdersByUserId(userId);
    }
    @PutMapping("/updateState")
    public int updateState(@RequestBody Orders order){
        return ordersService.updateState(order);
    }
}
