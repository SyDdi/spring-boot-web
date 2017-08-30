package com.dongnao.jack.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.dongnao.jack.interceptor.JackInterceptor;
import com.dongnao.jack.interceptor.JeffInterceptor;

@Configuration
public class SpringInterceptorRegister extends WebMvcConfigurerAdapter {
    
    /* 
     * 添加spring中的拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JackInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new JeffInterceptor())
                .addPathPatterns("/freemarker/**");
        super.addInterceptors(registry);
    }
    
    /* 
     * 注册静态文件的自定义映射路径
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**")
                .addResourceLocations("classpath:/image/");
        registry.addResourceHandler("/picture/**")
                .addResourceLocations("file:D:/picture/");
        super.addResourceHandlers(registry);
    }
}
