package com.comm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comm.pojo.Business;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IBusinessMapper extends BaseMapper<Business> {
    List<Business> getBusinessByOrderId(String orderId);
    Business getBusinessById(String bussId);
}
