package org.example.controller;

import com.comm.dao.IOrdersMapper;
import com.comm.pojo.Orders;
import jakarta.annotation.Resource;
import org.example.service.IOrdersService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin("*")
@RefreshScope
public class OrdersController {
    @Resource
    private IOrdersService ordersService;
    @PostMapping("/createOrders")
    public String createOrders(@RequestBody Orders orders){
        return ordersService.createOrders(orders);
    }
    @GetMapping("/getById")
    public Orders getOrdersById(@RequestParam String orId){
        return ordersService.getOrdersById(orId);
    }
    @GetMapping("/getByUserId")
    public List<Orders> listOrdersByUserId(@RequestParam String userId){
        return ordersService.listOrdersByUserId(userId);
    }
    @PutMapping("/updateState")
    public int updateState(@RequestBody Orders order){
        return ordersService.updateState(order);
    }
}
