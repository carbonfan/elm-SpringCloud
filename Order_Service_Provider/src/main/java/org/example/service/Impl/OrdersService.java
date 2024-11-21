package org.example.service.Impl;

import com.comm.dao.ICartMapper;
import com.comm.dao.IOrderDetailetMapper;
import com.comm.dao.IOrdersMapper;
import com.comm.pojo.Cart;
import com.comm.pojo.OrderDetailet;
import com.comm.pojo.Orders;
import jakarta.annotation.Resource;
import org.example.service.IOrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService implements IOrdersService {
    @Resource
    private IOrdersMapper ordersMapper;
    @Resource
    private ICartMapper cartMapper;
    @Resource
    private IOrderDetailetMapper odMapper;
    @Override
    @Transactional
    public String createOrders(Orders order){
        Cart cart = new Cart();
        //根据用户编号、商家编号、订单总金额、送货地址编号向订单表中添加一条记录
        cart.setUserId(order.getUserId());
        cart.setBusinessId(order.getBusinessId());
        order.setOrderDate(String.valueOf(System.currentTimeMillis()));

        ordersMapper.saveOrders(order);

        String orderId = order.getOrderId();

        List<Cart> cartList = cartMapper.listCart(cart);
        List<OrderDetailet> odlist = new ArrayList<>();

        for(Cart c : cartList){
            OrderDetailet od = new OrderDetailet();
            od.setOrderId(orderId);
            od.setFoodId(c.getFoodId());
            od.setQuantity(c.getQuantity());
            odlist.add(od);
        }
        odMapper.saveOrderDetailetBatch(odlist);
        cartMapper.removeCart(cart);
        return orderId;
    }
    @Override
    public Orders getOrdersById(String orderId){
        return ordersMapper.getOrdersById(orderId);
    }
    @Override
    public List<Orders> listOrdersByUserId(String userId){
        return ordersMapper.listOrdersByUserId(userId);
    }
    @Override
    public int updateState(Orders order){
        return ordersMapper.updateState(order);
    }
}
