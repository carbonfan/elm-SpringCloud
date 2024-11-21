package org.example.service.Impl;

import com.comm.dao.IBusinessMapper;
import com.comm.dao.ICartMapper;
import com.comm.pojo.Business;
import jakarta.annotation.Resource;
import org.example.service.IBusinessService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessService implements IBusinessService {
    @Resource
    private IBusinessMapper bussMapper;
    @Override
    public List<Business> getBusinessByOrderId(String orderId){
        return bussMapper.getBusinessByOrderId(orderId);
    }
    @Override
    public Business getBusinessById(String bussId){
        return bussMapper.getBusinessById(bussId);
    }
    @Override
    public List<Business> getAll(){
        return bussMapper.selectList(null);
    }
}
