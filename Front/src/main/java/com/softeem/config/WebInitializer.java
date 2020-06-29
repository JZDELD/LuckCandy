package com.softeem.config;

import com.softeem.config.spring.SpringDaoConfig;
import com.softeem.config.spring.SpringServiceConfig;
import com.softeem.config.spring.SpringWebConfig;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringDaoConfig.class, SpringServiceConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringWebConfig.class};
    }

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
