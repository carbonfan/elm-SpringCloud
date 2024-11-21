package com.comm.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class OrderDetailet {
	@TableId
	private String odId;
	private String orderId;
	private String foodId;
	private Integer quantity;

	private Food food;
}
