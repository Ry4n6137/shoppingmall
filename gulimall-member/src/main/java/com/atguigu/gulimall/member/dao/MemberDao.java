package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Ryan
 * @email sunlightcs@gmail.com
 * @date 2023-02-22 10:57:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
