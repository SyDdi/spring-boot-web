package com.dongnao.jack.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import com.dongnao.jack.servlet.JackServlet;

/** 
 * @Description springboot启动器 
 * @ClassName   SpringBootTest 
 * @Date        2017年8月27日 下午3:38:36 
 * @Author      动脑学院-jack
 */

@SpringBootApplication(scanBasePackages = {"com.dongnao.jack"})
@ServletComponentScan(basePackages = {"com.dongnao.jack"})
@MapperScan("com.dongnao.jack.dao")
public class SpringBootTest {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest.class, args);
    }
    
    /** 
     * @Description 这里是通过代码的形式注册一个Servlet，这种形式不需要@ServletComponentScan注解 
     * @param @return 参数 
     * @return ServletRegistrationBean 返回类型  
     * @throws 
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new JackServlet(), "/jack/*");
    }
    
}
