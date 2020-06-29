package com.softeem.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.softeem.bean.dto.HouseDTO;
import com.softeem.bean.dto.PageDTO;
import com.softeem.bean.dto.QueryHouseDTO;
import com.softeem.bean.dto.QueryLandlordDTO;
import com.softeem.bean.po.*;
import com.softeem.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/house")
public class HouseController {
    @Resource
    private HouseService houseService;

    @Resource
    private RoomService roomService;

    @Resource
    private CityService cityService;

    @Resource
    private RegionService regionService;

    @Resource
    private SubwayService subwayService;

    @Resource
    private LandlordService landlordService;

    @Resource
    private SalesmanService salesmanService;

    @Resource
    private ConfigurationService configurationService;

    @RequestMapping("/findHouseByQuery.action")
    public ModelAndView findHouseByQuery(QueryHouseDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        HouseExample example = new HouseExample();
        HouseExample.Criteria criteria = example.createCriteria();
        //设置查询条件
        if (query.getQueryId() != null) {
            criteria.andIdEqualTo(query.getQueryId());
        }
        if (query.getQueryStatus() != null) {
            criteria.andStatusEqualTo(query.getQueryStatus());
        }
        if (query.getQueryCityId() != null) {
            criteria.andCityIdEqualTo(query.getQueryCityId());
        }
        if (query.getQueryLandlordId() != null) {
            criteria.andLandlordIdEqualTo(query.getQueryLandlordId());
        }
        //分页
        PageHelper.startPage(query.getPageNow(), PageDTO.PAGE_SIZE);
        List<House> houseList = houseService.selectByExample(example);
        List<HouseDTO> houseDTOList = new ArrayList<>();
        for (int index = 0; index < houseList.size(); index++) {
            //获取house页面属性对象属性
            House house = houseList.get(index);
            City city = cityService.selectByPrimaryKey(house.getCityId());
            Region region = regionService.selectByPrimaryKey(house.getRegionId());
            Landlord landlord = landlordService.selectByPrimaryKey(house.getLandlordId());
            //设置属性到house页面数据对象
            HouseDTO houseDTO = new HouseDTO();
            houseDTO.setHouse(house);
            houseDTO.setCity(city);
            houseDTO.setRegion(region);
            houseDTO.setLandlord(landlord);
            houseDTOList.add(houseDTO);
        }
        //城市集合
        List<City> cityList = cityService.selectByExample(null);
        //分页导航条
        PageInfo pageInfo = new PageInfo(houseList);
        pageInfo.setPageSize(PageDTO.PAGE_SIZE);
        pageInfo.setTotal(houseService.countByExample(example));
        //当前页，总页数
        PageDTO pageDTO = new PageDTO(query.getPageNow(), pageInfo.getPages());
        //数据绑定
        modelAndView.addObject("houseDTOList", houseDTOList);
        modelAndView.addObject("cityList", cityList);
        modelAndView.addObject("query", query);
        modelAndView.addObject("pageDTO", pageDTO);
        modelAndView.setViewName("house/index");
        return modelAndView;
    }

    @RequestMapping("/details.action")
    public ModelAndView details(Integer id, QueryHouseDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        //获取house页面属性对象属性
        House house = houseService.selectByPrimaryKey(id);
        City city = cityService.selectByPrimaryKey(house.getCityId());
        Region region = regionService.selectByPrimaryKey(house.getRegionId());
        Subway subway = subwayService.selectByPrimaryKey(house.getSubwayId());
        Landlord landlord = landlordService.selectByPrimaryKey(house.getLandlordId());
        Configuration configuration = configurationService.selectByPrimaryKey(house.getConfigurationId());
        //设置属性到house页面数据对象
        HouseDTO houseDTO = new HouseDTO();
        houseDTO.setHouse(house);
        houseDTO.setCity(city);
        houseDTO.setRegion(region);
        houseDTO.setSubway(subway);
        houseDTO.setLandlord(landlord);
        houseDTO.setConfiguration(configuration);
        //房间查询
        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria roomExampleCriteria = roomExample.createCriteria();
        roomExampleCriteria.andHouseIdEqualTo(id);
        List<Room> roomList = roomService.selectByExample(roomExample);
        //业务员集合
        List<Salesman> salesmanList = salesmanService.selectByExample(null);
        //城市集合
        List<City> cityList = cityService.selectByExample(null);
        if (house.getCityId() != null) {
            //获取当前城市的区集合
            RegionExample regionExample = new RegionExample();
            RegionExample.Criteria regionExampleCriteria = regionExample.createCriteria();
            regionExampleCriteria.andCityIdEqualTo(house.getCityId());
            List<Region> regionList = regionService.selectByExample(regionExample);
            //获取当前城市的地铁线集合
            SubwayExample subwayExample = new SubwayExample();
            SubwayExample.Criteria subwayExampleCriteria = subwayExample.createCriteria();
            subwayExampleCriteria.andCityIdEqualTo(house.getCityId());
            List<Subway> subwayList = subwayService.selectByExample(subwayExample);
            modelAndView.addObject("regionList", regionList);
            modelAndView.addObject("subwayList", subwayList);
        }
        modelAndView.addObject("houseDTO", houseDTO);
        if (roomList.size() > 0) {
            modelAndView.addObject("roomList", roomList);
        }
        modelAndView.addObject("salesmanList", salesmanList);
        modelAndView.addObject("cityList", cityList);
        modelAndView.addObject("query", query);
        modelAndView.setViewName("house/info");
        return modelAndView;
    }


    /* 在 Spring MVC 的 Controller 中，
     *javax.swing.Spring MVC 就可以
     * 将用户上传的数据绑定到 CommonsMultipartFile 类型的参数上。
     * 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
     */
    @RequestMapping("/updateHouseInfo.action")
    public String updateHouseInfo(House house, Configuration configuration, QueryHouseDTO query, Model model,
                                  @RequestParam("imageFile") CommonsMultipartFile imageFile,
                                  @RequestParam("videoFile") CommonsMultipartFile videoFile) throws IOException {
        String path = "F:/LuckCandy/house/" + house.getId();
        //
        if (!imageFile.isEmpty()) {

            new File(path).mkdirs();
            String imagePath = path + "/fm.jpg";
            imageFile.transferTo(new File(imagePath));
            house.setImage("/file/house/" + house.getId() + "/fm.jpg");
        }
        if (!videoFile.isEmpty()) {
            new File(path).mkdirs();
            String videoPath = path + "/video.mp4";
            videoFile.transferTo(new File(videoPath));
            house.setVideo("/file/house/" + house.getId() + "/video.mp4");
        }


        if (house.getConfigurationId() == null) {
            configuration.setId(null);
            configurationService.insertSelective(configuration);
            house.setConfigurationId(configuration.getId());
        } else {
            configuration.setId(house.getConfigurationId());
            configurationService.updateByPrimaryKeySelective(configuration);
        }
        int isOk = houseService.updateByPrimaryKeySelective(house);

        if (isOk > 0) {
            model.addAttribute("msg", "更新成功");
        } else {
            model.addAttribute("msg", "更新失败");
        }

        String id = "id=" + house.getId();
        String pageNow = "&pageNow=" + query.getPageNow();
        String queryId = "&queryId=" + query.getQueryId();
        String queryStatus = "&queryStatus=" + query.getQueryStatus();
        String queryCityId = "&queryCityId=" + query.getQueryCityId();
        String queryLandlordId = "&queryLandlordId=" + query.getQueryLandlordId();

        return "forward:/house/details.action?" + id + pageNow + queryId + queryStatus + queryCityId + queryLandlordId;
    }

    @RequestMapping("/insertHouse.action")
    public ModelAndView insertHouse(House house, Configuration configuration, QueryLandlordDTO query,
                                    @RequestParam("imageFile") CommonsMultipartFile imageFile,
                                    @RequestParam("videoFile") CommonsMultipartFile videoFile) throws IOException {
        ModelAndView modelAndView = new ModelAndView();

        String path = "F:/LuckCandy/house/" + house.getId();
        //
        if (!imageFile.isEmpty()) {

            new File(path).mkdirs();
            String imagePath = path + "/fm.jpg";
            imageFile.transferTo(new File(imagePath));
            house.setImage("/file/house/" + house.getId() + "/fm.jpg");
        }
        if (!videoFile.isEmpty()) {
            new File(path).mkdirs();
            String videoPath = path + "/video.mp4";
            videoFile.transferTo(new File(videoPath));
            house.setVideo("/file/house/" + house.getId() + "/video.mp4");
        }

        configuration.setId(null);
        configurationService.insertSelective(configuration);
        house.setConfigurationId(configuration.getId());

        int isOk = houseService.insertSelective(house);

        if (isOk > 0) {
            modelAndView.addObject("msg", "添加成功");
        } else {
            modelAndView.addObject("msg", "添加失败");
        }

        Landlord landlord = landlordService.selectByPrimaryKey(house.getLandlordId());
        List<Salesman> salesmanList = salesmanService.selectByExample(null);
        List<City> cityList = cityService.selectByExample(null);

        modelAndView.addObject("landlord", landlord);
        modelAndView.addObject("salesmanList", salesmanList);
        modelAndView.addObject("cityList", cityList);
        modelAndView.addObject("query", query);
        modelAndView.setViewName("house/insert");
        return modelAndView;
    }

    @RequestMapping("deleteHouseById.action")
    public String deleteHouseById(Integer id, Model model) {
        if (houseService.deleteByPrimaryKey(id) > 0) {
            model.addAttribute("msg", "删除成功");
        } else {
            model.addAttribute("msg", "删除失败");
        }
        return "forward:/house/findHouseByQuery.action";
    }

    @RequestMapping("/deleteHouseByIds.action")
    public String deleteHouseByIds(@RequestParam(value = "id") Integer[] ids, Model model) {
        int index = 0;
        HouseExample example = new HouseExample();

        while (index < ids.length) {
            HouseExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(ids[index]);
            example.or(criteria);
            index++;
        }

        //批量删除并或取被删除的数据的数量
        int count = houseService.deleteByExample(example);
        if (count > 0) {
            model.addAttribute("msg", "成功删除" + count + "个房屋");
        } else {
            model.addAttribute("msg", "删除失败");
        }
        return "forward:/house/findHouseByQuery.action";
    }

    @RequestMapping("/findRegionAndSubwayByCityId.action")
    public void findRegionAndSubwayByCityId(Integer cityId, HttpServletRequest request, HttpServletResponse response) throws IOException {
        RegionExample regionExample = new RegionExample();
        RegionExample.Criteria regionExampleCriteria = regionExample.createCriteria();
        regionExampleCriteria.andCityIdEqualTo(cityId);

        SubwayExample subwayExample = new SubwayExample();
        SubwayExample.Criteria subwayExampleCriteria = subwayExample.createCriteria();
        subwayExampleCriteria.andCityIdEqualTo(cityId);

        List<Region> regionList = regionService.selectByExample(regionExample);
        List<Subway> subwayList = subwayService.selectByExample(subwayExample);

        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("region", regionList);
        objectMap.put("subway", subwayList);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(objectMap);
        System.out.println(json);
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();

        out.write(json);
        out.flush();
        out.close();
    }
}
