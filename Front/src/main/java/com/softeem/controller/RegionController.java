package com.softeem.controller;

import com.softeem.bean.po.Region;
import com.softeem.bean.po.RegionExample;
import com.softeem.service.RegionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RegionController {
    @Resource
    private RegionService regionService;

    @RequestMapping("/findRegionByCityId.action")
    public String findRegionByCityId(Integer cityId, HttpSession session, Model model) {
        RegionExample example = new RegionExample();
        RegionExample.Criteria criteria = example.createCriteria();
        criteria.andCityIdEqualTo(cityId);
        List<Region> regionList = regionService.selectByExample(example);
        session.setAttribute("cityId", cityId);
        model.addAttribute("regionList", regionList);
        return "forward:/findSubwayByCityId.action";
    }
}
