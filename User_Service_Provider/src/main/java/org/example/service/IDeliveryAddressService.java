package org.example.service;

import com.comm.pojo.DeliveryAddress;

import java.util.List;

public interface IDeliveryAddressService {
    List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
    DeliveryAddress getDeliveryAddressById(String daId);
    int saveDeliveryAddress(DeliveryAddress da);
    int updateDeliveryAddress(DeliveryAddress da);
    int removeDeliveryAddress(String daId);
}
