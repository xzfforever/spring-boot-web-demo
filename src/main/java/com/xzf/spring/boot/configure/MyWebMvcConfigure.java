package com.xzf.spring.boot.configure;

import com.xzf.spring.boot.intercepter.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class MyWebMvcConfigure extends WebMvcConfigurerAdapter {

    /**
     * 注册自定义的拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }


}
