package com.softeem.controller;

import com.softeem.bean.dto.QueryHouseOrRoomDTO;
import com.softeem.bean.po.Room;
import com.softeem.bean.po.RoomExample;
import com.softeem.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

@Controller
public class RoomController {
    @Resource
    private RoomService roomService;

    @RequestMapping("/findRoomByQuery.action")
    public String findRoomByQuery(Model model, HttpServletRequest request) {
        QueryHouseOrRoomDTO query = (QueryHouseOrRoomDTO) request.getAttribute("query");
        Integer status = query.getStatus();
        BigDecimal areaMin = query.getAreaMin();
        BigDecimal areaMax = query.getAreaMax();
        Double priceMin = query.getPriceMin();
        Double priceMax = query.getPriceMax();
        String[] houseIds = query.getHouseIds().split(",");

        RoomExample example = new RoomExample();
        for (String houseId : houseIds) {
            RoomExample.Criteria criteria = example.createCriteria();
            criteria.andHouseIdEqualTo(Integer.valueOf(houseId));
            if(status != null){
                criteria.andStatusEqualTo(status);
            }
            if (areaMin != null && areaMax != null ) {
                if (areaMin.compareTo(areaMax) < 0) {
                    criteria.andAreaBetween(areaMin, areaMax);
                } else {
                    criteria.andAreaBetween(areaMax, areaMin);
                }
            } else if (areaMin != null) {
                criteria.andAreaGreaterThanOrEqualTo(areaMin);
            } else if (areaMax != null) {
                criteria.andAreaLessThanOrEqualTo(areaMax);
            }
            if (priceMin != null && priceMax != null) {
                if (priceMin < priceMax) {
                    criteria.andSeasonPriceBetween(priceMin, priceMax);
                } else {
                    criteria.andSeasonPriceBetween(priceMax, priceMin);
                }
            } else if (priceMin != null) {
                criteria.andSeasonPriceGreaterThanOrEqualTo(priceMin);
            } else if (priceMax != null) {
                criteria.andSeasonPriceLessThanOrEqualTo(priceMax);
            }
            example.or(criteria);
        }

        List<Room> roomList = roomService.selectByExample(example);
        System.out.println(roomList.size());
        model.addAttribute("roomList", roomList);
        return "forward:/rent.jsp";
    }
}
