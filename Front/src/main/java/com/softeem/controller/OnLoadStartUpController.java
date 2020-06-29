package com.softeem.controller;

import com.softeem.bean.po.City;
import com.softeem.service.CityService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

@Controller
public class OnLoadStartUpController implements InitializingBean, ServletContextAware {
	@Resource
	private CityService cityService;

	@Override
	public void afterPropertiesSet() throws Exception {

	}

	@Override
	public void setServletContext(ServletContext application) {
		List<City> cityList = cityService.selectByExample(null);
		application.setAttribute("cityList", cityList);
	}
}
