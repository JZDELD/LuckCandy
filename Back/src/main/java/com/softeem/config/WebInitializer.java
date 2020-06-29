package com.softeem.config;

import com.softeem.config.spring.SpringDaoConfig;
import com.softeem.config.spring.SpringServiceConfig;
import com.softeem.config.spring.SpringWebConfig;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//它等价于之前的web.xml
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //第1次加载配置时机，加载啥？
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringDaoConfig.class, SpringServiceConfig.class};
    }

    //第2次加载配置时机，加载啥？
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringWebConfig.class};
    }

    //DispatcherServlet拦截哪些请求（转交给Controller）
    @Override
    protected String[] getServletMappings() {
        return new String[]{"*.action"};
    }

    @Override
    protected Filter[] getServletFilters() {
        Filter encodingFilter = new CharacterEncodingFilter("UTF-8", true);
        return new Filter[]{encodingFilter};
    }
}
