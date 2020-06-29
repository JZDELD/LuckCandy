package com.softeem.controller;

import com.softeem.bean.po.Subway;
import com.softeem.bean.po.SubwayExample;
import com.softeem.service.SubwayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SubwayController {
    @Resource
    private SubwayService subwayService;

    @RequestMapping("/findSubwayByCityId.action")
    public String findSubwayByCityId(Integer cityId, Model model) {
        SubwayExample example = new SubwayExample();
        SubwayExample.Criteria criteria = example.createCriteria();
        criteria.andCityIdEqualTo(cityId);
        List<Subway> subwayList = subwayService.selectByExample(example);
        model.addAttribute("subwayList", subwayList);
        return "forward:/findHouseByQuery.action";
    }
}
