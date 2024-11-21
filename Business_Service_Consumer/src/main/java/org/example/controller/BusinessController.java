package org.example.controller;

import com.comm.pojo.Business;
import jakarta.annotation.Resource;
import org.example.service.IBusinessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @Resource
    private IBusinessService bussService;

    @GetMapping("/getByOrderTypeId")
    public List<Business> getBusinessByOrderId(@RequestParam("orderTypeId") String orderTypeId){
        return bussService.getBusinessByOrderId(orderTypeId);
    }
    @GetMapping("/getById")
    public Business getBusinessById(@RequestParam("bussId") String bussId){
        return bussService.getBusinessById(bussId);
    }
    @GetMapping("/getAll")
    public List<Business> getAll(){
        return bussService.getAll();
    }
}
