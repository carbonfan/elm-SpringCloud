package com.comm.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class Orders {
	@TableId
	private String orderId;
	private String userId;
	private String businessId;
	private String orderDate;
	private Double orderTotal;
	private String daId;
	private Integer orderState;
	
	private Business business;
	private List<OrderDetailet> list;

}
