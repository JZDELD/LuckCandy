package com.softeem.controller;

import com.softeem.bean.dto.QueryHouseOrRoomDTO;
import com.softeem.bean.po.House;
import com.softeem.bean.po.HouseExample;
import com.softeem.service.HouseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

@Controller
public class HouseController {
    @Resource
    private HouseService houseService;

    @RequestMapping("/findHouseByQuery.action")
    public String findHouseByQuery(QueryHouseOrRoomDTO query, Model model, HttpServletRequest request) {
        Integer cityId = query.getCityId();
        Integer regionId = query.getRegionId();
        Integer subwayId = query.getSubwayId();
        String communityOrBusinessCircleName = query.getCommunityOrBusinessCircleName();
        Integer rentType = query.getRentType();
        Integer status = query.getStatus();
        BigDecimal areaMin = query.getAreaMin();
        BigDecimal areaMax = query.getAreaMax();
        Double priceMin = query.getPriceMin();
        Double priceMax = query.getPriceMax();

        HouseExample example = new HouseExample();
        HouseExample.Criteria criteria = example.createCriteria();
        HouseExample.Criteria criteria2 = example.createCriteria();

        criteria.andCityIdEqualTo(cityId);
        criteria2.andCityIdEqualTo(cityId);
        if (regionId != null) {
            criteria.andRegionIdEqualTo(regionId);
            criteria2.andRegionIdEqualTo(regionId);
        }
        if (subwayId != null) {
            criteria.andSubwayIdEqualTo(subwayId);
            criteria2.andSubwayIdEqualTo(subwayId);
        }
        if (communityOrBusinessCircleName != null && communityOrBusinessCircleName != "") {
            criteria.andCommunityNameLike("%" + communityOrBusinessCircleName + "%");
            criteria2.andBusinessCircleNameLike("%" + communityOrBusinessCircleName + "%");
        }

        if (rentType == 0) {
            example.or(criteria2);
            List<House> houseList = houseService.selectByExample(example);
            if (houseList.size() > 0) {
                String houseIds = "";
                for (House house : houseList) {
                    houseIds += house.getId() + ",";
                }
                query.setHouseIds(houseIds);
                request.setAttribute("query", query);
                return "forward:/findRoomByQuery.action";
            } else {
                model.addAttribute("query", query);
                return "forward:/rent.jsp";
            }

        } else {
            criteria.andSalesmanIdGreaterThan(0);
            criteria2.andSalesmanIdGreaterThan(0);
        }
        if (status != null) {
            criteria.andStatusEqualTo(status);
            criteria2.andStatusEqualTo(status);
        }
        if (areaMin != null && areaMax != null) {
            if (areaMin.compareTo(areaMax) < 0) {
                criteria.andAreaBetween(areaMin, areaMax);
                criteria2.andAreaBetween(areaMin, areaMax);
            } else {
                criteria.andAreaBetween(areaMax, areaMin);
                criteria2.andAreaBetween(areaMax, areaMin);
            }
        } else if (areaMin != null) {
            criteria.andAreaGreaterThanOrEqualTo(areaMin);
            criteria2.andAreaGreaterThanOrEqualTo(areaMin);
        } else if (areaMax != null) {
            criteria.andAreaLessThanOrEqualTo(areaMax);
            criteria2.andAreaLessThanOrEqualTo(areaMax);
        }
        if (priceMin != null && priceMax != null) {
            if (priceMin < priceMax) {
                criteria.andSeasonPriceBetween(priceMin, priceMax);
                criteria2.andSeasonPriceBetween(priceMin, priceMax);
            } else {
                criteria.andSeasonPriceBetween(priceMax, priceMin);
                criteria2.andSeasonPriceBetween(priceMax, priceMin);
            }
        } else if (priceMin != null) {
            criteria.andSeasonPriceGreaterThanOrEqualTo(priceMin);
            criteria2.andSeasonPriceGreaterThanOrEqualTo(priceMin);
        } else if (priceMax != null) {
            criteria.andSeasonPriceLessThanOrEqualTo(priceMax);
            criteria2.andSeasonPriceLessThanOrEqualTo(priceMax);
        }
        example.or(criteria2);
        List<House> houseList = houseService.selectByExample(example);
        model.addAttribute("houseList", houseList);
        model.addAttribute("query", query);
        return "forward:/rent.jsp";
    }
}
