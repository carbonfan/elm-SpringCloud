package org.example.service;

import com.comm.pojo.Business;

import java.util.List;

public interface IBusinessService {
    List<Business> getBusinessByOrderId(String orderId);
    Business getBusinessById(String bussId);
    List<Business> getAll();
}
