package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author Ryan
 * @email sunlightcs@gmail.com
 * @date 2023-02-20 19:05:37
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
