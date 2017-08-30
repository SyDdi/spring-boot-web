package com.dongnao.jack.test;

import java.util.HashMap;

import com.dongnao.jack.dao.BrandMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.dongnao.jack.controller.SpringBootTest;
import com.dongnao.jack.dao.CommonMapper;

@RunWith(SpringJUnit4ClassRunner.class)
// SpringJUnit支持，由此引入Spring-Test框架支持！ 
@SpringApplicationConfiguration(classes = SpringBootTest.class)
// 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class MyTest {
    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);
    
    @Autowired
    CommonMapper mapper;

    @Autowired
    private BrandMapper brandMapper;
    @Test
    public void test1() {
        System.out.println(mapper.queryContent(new HashMap()));
    }
    @Test
    public void test2() {
        System.out.println(brandMapper.queryBrandById(1L));
    }



}
