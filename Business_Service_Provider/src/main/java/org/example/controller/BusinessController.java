package org.example.controller;

import com.comm.pojo.Business;
import jakarta.annotation.Resource;
import org.example.service.IBusinessService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/business")
@CrossOrigin("*")
@RefreshScope
public class BusinessController {
    @Resource
    private IBusinessService bussService;

    @GetMapping("/getByOrderTypeId")
    public List<Business> getBusinessByOrderId(@RequestParam String orderTypeId){
        return bussService.getBusinessByOrderId(orderTypeId);
    }
    @GetMapping("/getById")
    public Business getBusinessById(@RequestParam String bussId){
        return bussService.getBusinessById(bussId);
    }
    @GetMapping("/getAll")
    public List<Business> getAll(){
        return bussService.getAll();
    }
}
