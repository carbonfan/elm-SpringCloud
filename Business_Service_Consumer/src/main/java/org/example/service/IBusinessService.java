package org.example.service;

import com.comm.pojo.Business;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("business-service-provider")
public interface IBusinessService {
    @GetMapping("/business/getByOrderTypeId")
    public List<Business> getBusinessByOrderId(@RequestParam("orderTypeId") String orderTypeId);
    @GetMapping("/business/getById")
    public Business getBusinessById(@RequestParam("bussId") String bussId);
    @GetMapping("/business/getAll")
    public List<Business> getAll();
}
