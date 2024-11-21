package org.example.controller;

import com.comm.pojo.DeliveryAddress;
import jakarta.annotation.Resource;
import org.example.service.IDeliveryAddressService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/da")
@CrossOrigin("*")
@RefreshScope
public class DeliveryAddressController {
    @Resource
    private IDeliveryAddressService daService;
    @GetMapping("/getDAList")
    public List<DeliveryAddress> listDeliveryAddressByUserId(@RequestParam String userId){
        return daService.listDeliveryAddressByUserId(userId);
    }
    @GetMapping("/getById")
    public DeliveryAddress getDeliveryAddressById(@RequestParam String daId){
        return daService.getDeliveryAddressById(daId);
    }
    @PostMapping("/saveDA")
    public int saveDeliveryAddress(@RequestBody DeliveryAddress da){
        return daService.saveDeliveryAddress(da);
    }
    @PutMapping("/updateDA")
    public int updateDeliveryAddress(@RequestBody DeliveryAddress da){
        return daService.updateDeliveryAddress(da);
    }
    @DeleteMapping("/removeDA")
    public int removeDeliveryAddress(@RequestParam String daId){
        return daService.removeDeliveryAddress(daId);
    }
}
