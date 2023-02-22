package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
*       首先是要来整合Mybatis-plus
*       1.导入依赖mybatis-plus-starter 在common的这个module中
*       2.进行配置
*           （1）再导入数据库mysql的driver
*           （2）在product module里的property.yml文件中配置与数据库相连的信息
*           （3）使用mybatis中的@MapperScan告诉dao层在哪里
*           （4）
* */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
