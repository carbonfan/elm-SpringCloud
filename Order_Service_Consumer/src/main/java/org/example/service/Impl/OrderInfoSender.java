package org.example.service.Impl;

import com.comm.pojo.Orders;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public String sendOrderInfo(Orders orders) {
        if (orders != null) {
            // 使用convertSendAndReceive等待返回结果
            String response = (String) amqpTemplate.convertSendAndReceive("order_queue", orders);
            return response;
        }
        return null;
    }
}

