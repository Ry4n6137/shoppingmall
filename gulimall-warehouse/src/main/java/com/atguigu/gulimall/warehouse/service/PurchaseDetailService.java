package com.atguigu.gulimall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.warehouse.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Ryan
 * @email sunlightcs@gmail.com
 * @date 2023-02-22 11:22:13
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

