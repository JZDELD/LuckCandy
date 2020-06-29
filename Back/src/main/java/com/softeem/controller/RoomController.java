package com.softeem.controller;

import com.softeem.bean.dto.QueryHouseDTO;
import com.softeem.bean.dto.RoomDTO;
import com.softeem.bean.po.Configuration;
import com.softeem.bean.po.Room;
import com.softeem.bean.po.RoomExample;
import com.softeem.service.ConfigurationService;
import com.softeem.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/room")
public class RoomController {
    @Resource
    private RoomService roomService;
    @Resource
    private ConfigurationService configurationService;

    @RequestMapping("/details.action")
    public ModelAndView details(Integer id, QueryHouseDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        //获取house页面属性对象属性
        Room room = roomService.selectByPrimaryKey(id);

        Configuration configuration = configurationService.selectByPrimaryKey(room.getConfigurationId());
        //设置属性到house页面数据对象
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setRoom(room);
        roomDTO.setConfiguration(configuration);
        //房间查询
        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria roomExampleCriteria = roomExample.createCriteria();
        roomExampleCriteria.andHouseIdEqualTo(id);
        //数据绑定
        modelAndView.addObject("roomDTO", roomDTO);
        modelAndView.addObject("query", query);
        modelAndView.setViewName("house/roomInfo");
        return modelAndView;
    }


    /* 在 Spring MVC 的 Controller 中，
     *javax.swing.Spring MVC 就可以
     * 将用户上传的数据绑定到 CommonsMultipartFile 类型的参数上。
     * 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
     */
    @RequestMapping("/updateRoomInfo.action")
    public String updateRoomInfo(Room room, Configuration configuration, QueryHouseDTO query, Model model,
                                 @RequestParam("imageFile") CommonsMultipartFile imageFile,
                                 @RequestParam("videoFile") CommonsMultipartFile videoFile) throws IOException {
        String path = "F:/LuckCandy/house/" + room.getHouseId() + "/room/" + room.getId();
        //
        if (!imageFile.isEmpty()) {
            new File(path).mkdirs();
            String imagePath = path + "/fm.jpg";
            imageFile.transferTo(new File(imagePath));
            room.setImage("/file/house/" + room.getHouseId() + "/room/" + room.getId() + "/fm.jpg");
        }
        if (!videoFile.isEmpty()) {
            new File(path).mkdirs();
            String videoPath = path + "/video.mp4";
            videoFile.transferTo(new File(videoPath));
            room.setVideo("/file/house/" + room.getHouseId() + "/room/" + room.getId() + "/video.mp4");
        }
        if (room.getConfigurationId() == null) {
            configuration.setId(null);
            configurationService.insertSelective(configuration);
            room.setConfigurationId(configuration.getId());
        } else {
            configuration.setId(room.getConfigurationId());
            configurationService.updateByPrimaryKeySelective(configuration);
        }
        int isOk = roomService.updateByPrimaryKeySelective(room);

        if (isOk > 0) {
            model.addAttribute("msg", "更新成功");
        } else {
            model.addAttribute("msg", "更新失败");
        }

        String id = "id=" + room.getHouseId();
        String pageNow = "&pageNow=" + query.getPageNow();
        String queryId = "&queryId=" + query.getQueryId();
        String queryStatus = "&queryStatus=" + query.getQueryStatus();
        String queryCityId = "&queryCityId=" + query.getQueryCityId();
        String queryLandlordId = "&queryLandlordId=" + query.getQueryLandlordId();

        return "forward:/room/details.action?" + id + pageNow + queryId + queryStatus + queryCityId + queryLandlordId;
    }

    @RequestMapping("/insertRoom.action")
    public ModelAndView insertRoom(Room room, Configuration configuration, QueryHouseDTO query,
                                   @RequestParam("imageFile") CommonsMultipartFile imageFile,
                                   @RequestParam("videoFile") CommonsMultipartFile videoFile) throws IOException {
        ModelAndView modelAndView = new ModelAndView();

        String path = "F:/LuckCandy/house/" + room.getHouseId() + "/room/" + room.getId();
        //
        if (!imageFile.isEmpty()) {
            new File(path).mkdirs();
            String imagePath = path + "/fm.jpg";
            imageFile.transferTo(new File(imagePath));
            room.setImage("/file/house/" + room.getHouseId() + "/room/" + room.getId() + "/fm.jpg");
        }
        if (!videoFile.isEmpty()) {
            new File(path).mkdirs();
            String videoPath = path + "/video.mp4";
            videoFile.transferTo(new File(videoPath));
            room.setVideo("/file/house/" + room.getHouseId() + "/room/" + room.getId() + "/video.mp4");
        }

        configuration.setId(null);
        configurationService.insertSelective(configuration);
        room.setConfigurationId(configuration.getId());

        int isOk = roomService.insertSelective(room);

        if (isOk > 0) {
            modelAndView.addObject("msg", "添加成功");
        } else {
            modelAndView.addObject("msg", "添加失败");
        }

        modelAndView.addObject("houseId", room.getHouseId());
        modelAndView.addObject("query", query);
        modelAndView.setViewName("house/roomInsert");
        return modelAndView;
    }

    @RequestMapping("deleteRoomById.action")
    public String deleteRoomById(Integer id,Integer houseId, Model model) {
        if (roomService.deleteByPrimaryKey(id) > 0) {
            model.addAttribute("msg", "删除成功");
        } else {
            model.addAttribute("msg", "删除失败");
        }
        return "forward:/house/details.action?id=" + houseId;
    }
}
