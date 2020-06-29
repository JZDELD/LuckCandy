package com.softeem.controller;

import com.softeem.bean.dto.QueryHouseDTO;
import com.softeem.bean.dto.QueryLandlordDTO;
import com.softeem.bean.dto.QueryUserDTO;
import com.softeem.bean.po.City;
import com.softeem.bean.po.Landlord;
import com.softeem.bean.po.Salesman;
import com.softeem.service.CityService;
import com.softeem.service.HouseService;
import com.softeem.service.LandlordService;
import com.softeem.service.SalesmanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ForwardController {
    @Resource
    private LandlordService landlordService;
    @Resource
    private SalesmanService salesmanService;
    @Resource
    private CityService cityService;
    @Resource
    private HouseService houseService;

    @RequestMapping("/admin/home")
    public String adminHome() {
        return "forward:/WEB-INF/jsp/admin/home.jsp";
    }

    @RequestMapping("/user/insert")
    public String userInsert(QueryUserDTO query, Model model) {
        model.addAttribute("query", query);
        return "forward:/WEB-INF/jsp/user/insert.jsp";
    }

    @RequestMapping("/landlord/insert")
    public String landlordInsert(QueryLandlordDTO query, Model model) {
        model.addAttribute("query", query);
        return "forward:/WEB-INF/jsp/landlord/insert.jsp";
    }

    @RequestMapping("/house/insert")
    public String houseInsert(Integer id, QueryLandlordDTO query, Model model) {
        Landlord landlord = landlordService.selectByPrimaryKey(id);
        List<Salesman> salesmanList = salesmanService.selectByExample(null);
        List<City> cityList = cityService.selectByExample(null);
        model.addAttribute("landlord", landlord);
        model.addAttribute("salesmanList", salesmanList);
        model.addAttribute("cityList", cityList);
        model.addAttribute("query", query);
        return "forward:/WEB-INF/jsp/house/insert.jsp";
    }

    @RequestMapping("/house/roomInsert")
    public String roomInsert(Integer id, QueryHouseDTO query, Model model) {
        model.addAttribute("houseId", id);
        model.addAttribute("query", query);
        return "forward:/WEB-INF/jsp/house/roomInsert.jsp";
    }
}
