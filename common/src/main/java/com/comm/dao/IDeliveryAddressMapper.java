package com.comm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comm.pojo.DeliveryAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IDeliveryAddressMapper extends BaseMapper<DeliveryAddress> {
    List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
    DeliveryAddress getDeliveryAddressById(String daId);
    int saveDeliveryAddress(DeliveryAddress da);
    int updateDeliveryAddress(DeliveryAddress da);
    int removeDeliveryAddress(String daId);
}
