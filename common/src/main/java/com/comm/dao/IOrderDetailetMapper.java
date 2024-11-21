package com.comm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comm.pojo.OrderDetailet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IOrderDetailetMapper extends BaseMapper<OrderDetailet> {
    void saveOrderDetailetBatch(List<OrderDetailet> odlist);
    List<OrderDetailet> listOrderDetailetByOrderId(String orderId);
}
