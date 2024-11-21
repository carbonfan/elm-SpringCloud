package com.comm.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class DeliveryAddress {
	@TableId
	private String daId;
	private String contactName;
	private Integer contactSex;
	private String contactTel;
	private String address; 
	private String userId;
}
