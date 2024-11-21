package org.example.service.Impl;

import com.comm.dao.IDeliveryAddressMapper;
import com.comm.pojo.DeliveryAddress;
import jakarta.annotation.Resource;
import org.example.service.IDeliveryAddressService;
import org.example.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryAddressService implements IDeliveryAddressService {
    @Resource
    private IDeliveryAddressMapper daMapper;
    @Override
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId){
        return daMapper.listDeliveryAddressByUserId(userId);
    }
    @Override
    public DeliveryAddress getDeliveryAddressById(String daId){
        return daMapper.getDeliveryAddressById(daId);
    }
    @Override
    public int saveDeliveryAddress(DeliveryAddress da){
        return daMapper.saveDeliveryAddress(da);
    }
    @Override
    public int updateDeliveryAddress(DeliveryAddress da){
        return daMapper.updateDeliveryAddress(da);
    }
    @Override
    public int removeDeliveryAddress(String daId){
        return daMapper.removeDeliveryAddress(daId);
    }
}
