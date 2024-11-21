package com.comm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comm.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IOrdersMapper extends BaseMapper<Orders> {
    Orders getOrdersById(String orderId);
    List<Orders> listOrdersByUserId(String userId);
    int saveOrders(Orders orders);
    int updateState(Orders order);
}
