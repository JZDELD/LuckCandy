package com.softeem.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc   //注解驱动
@ComponentScan("com.softeem.controller")   //包扫描
public class SpringWebConfig implements WebMvcConfigurer {
    @Bean   //视图解析器
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public CommonsMultipartResolver multipartResolver (){
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        //设置上传文件的最大容量为5M
        multipartResolver.setMaxUploadSize(5*1024*1024);
        //此为阈值，低于此值，则保存在内存中，如高于此值，则生成硬盘上的临时文件
        multipartResolver.setMaxInMemorySize(1*1024*1024);
        multipartResolver.setDefaultEncoding("UTF-8");
        return multipartResolver;
    }
}
