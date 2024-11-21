package org.example.service.Impl;

import com.comm.pojo.Orders;
import jakarta.annotation.Resource;
import org.example.service.IOrdersService;
import org.springframework.stereotype.Service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Service
public class OrderInfoReceiver {
    @Resource
    private IOrdersService ordersService;

    @RabbitListener(queues = "order_queue")
    public String receiveOrder(Orders orders) {
        return processOrder(orders);
    }

    private String processOrder(Orders orders) {
        return ordersService.createOrders(orders);
    }
}
