package com.comm.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Business {
    @TableId//不加使用selectById时会报错
    private String businessId;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private String businessImg;
    private String orderTypeId;
    private Double starPrice;
    private Double deliveryPrice;
    private String remarks;

}
