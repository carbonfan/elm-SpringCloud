package org.example.service;

import com.comm.pojo.DeliveryAddress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("user-service-provider")
public interface IDeliveryAddressService {
    @GetMapping("/da/getDAList")
    public List<DeliveryAddress> listDeliveryAddressByUserId(@RequestParam("userId") String userId);
    @GetMapping("/da/getById")
    public DeliveryAddress getDeliveryAddressById(@RequestParam("daId") String daId);
    @PostMapping("/da/saveDA")
    public int saveDeliveryAddress(@RequestBody DeliveryAddress da);
    @PutMapping("/da/updateDA")
    public int updateDeliveryAddress(@RequestBody DeliveryAddress da);
    @DeleteMapping("/da/removeDA")
    public int removeDeliveryAddress(@RequestParam("daId") String daId);
}
