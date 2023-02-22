package com.atguigu.gulimall.warehouse.dao;

import com.atguigu.gulimall.warehouse.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Ryan
 * @email sunlightcs@gmail.com
 * @date 2023-02-22 11:22:13
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
