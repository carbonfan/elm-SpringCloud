package com.comm.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Cart {
	@TableId
	private String cartId;
	private String foodId;
	private String businessId;
	private String userId;
	private Integer quantity;

	private Food food;
	private Business business;

}
