package org.example.service;

import com.comm.pojo.Orders;

import java.util.List;

public interface IOrdersService {
    String createOrders(Orders order);
    Orders getOrdersById(String orderId);
    List<Orders> listOrdersByUserId(String userId);
    int updateState(Orders order);
}
