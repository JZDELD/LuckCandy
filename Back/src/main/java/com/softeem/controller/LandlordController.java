package com.softeem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.softeem.bean.dto.PageDTO;
import com.softeem.bean.dto.QueryLandlordDTO;
import com.softeem.bean.po.Landlord;
import com.softeem.bean.po.LandlordExample;
import com.softeem.service.LandlordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/landlord")
public class LandlordController {
    @Resource
    private LandlordService landlordService;

    @RequestMapping("/findLandlordByQuery.action")
    public ModelAndView findLandlordByQuery(QueryLandlordDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        LandlordExample example = new LandlordExample();
        LandlordExample.Criteria criteria = example.createCriteria();
        if (query.getQueryId() != null) {
            criteria.andIdEqualTo(query.getQueryId());
        }
        if (query.getQueryName() != null && query.getQueryName() != "") {
            criteria.andNameLike("%" + query.getQueryName() + "%");
        }
        if (query.getQueryHome() != null && query.getQueryHome() != "") {
            criteria.andHomeLike("%" + query.getQueryHome() + "%");
        }
        //分页
        PageHelper.startPage(query.getPageNow(), PageDTO.PAGE_SIZE);
        List<Landlord> landlordList = landlordService.selectByExample(example);
        //分页导航条
        PageInfo pageInfo = new PageInfo(landlordList);
        pageInfo.setPageSize(PageDTO.PAGE_SIZE);
        pageInfo.setTotal(landlordService.countByExample(example));
        //当前页，总页数
        PageDTO pageDTO = new PageDTO(query.getPageNow(), pageInfo.getPages());
        //
        modelAndView.addObject("landlordList", landlordList);
        modelAndView.addObject("query", query);
        modelAndView.addObject("pageDTO", pageDTO);
        modelAndView.setViewName("landlord/index");
        return modelAndView;
    }

    @RequestMapping("/details.action")
    public ModelAndView details(Integer id, QueryLandlordDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        Landlord landlord = landlordService.selectByPrimaryKey(id);
        modelAndView.addObject("landlord", landlord);
        modelAndView.addObject("query", query);
        modelAndView.setViewName("landlord/info");
        return modelAndView;
    }

    /*
     * 在 Spring MVC 的 Controller 中，Spring MVC 就可以
     * 将用户上传的数据绑定到 CommonsMultipartFile 类型的参数上。
     * 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
     */
    @RequestMapping("/updateLandlordInfo.action")
    public String updateLandlordInfo(Landlord landlord, QueryLandlordDTO query, Model model,
                                     @RequestParam("avatarFile") CommonsMultipartFile avatarFile) throws IOException {
        String path = "F:/LuckCandy/landlord/" + landlord.getId();
        //
        if (!avatarFile.isEmpty()) {
            new File(path).mkdirs();
            path = path + "/avatarPic.png";
            avatarFile.transferTo(new File(path));
            landlord.setAvatar("/file/landlord/" + landlord.getId() + "/avatarPic.png");
        }
        int isOk = landlordService.updateByPrimaryKeySelective(landlord);

        if (isOk > 0) {
            model.addAttribute("msg", "更新成功");
        } else {
            model.addAttribute("msg", "更新失败");
        }

        String id = "id=" + landlord.getId();
        String pageNow = "&pageNow=" + query.getPageNow();
        String queryId = "&queryId=" + query.getQueryId();
        String queryName = "&queryName=" + query.getQueryName();
        String queryHome = "&queryHome=" + query.getQueryHome();

        return "forward:/landlord/details.action?" + id + pageNow + queryId + queryName + queryHome;
    }

    @RequestMapping("/insertLandlord.action")
    public ModelAndView insertLandlord(Landlord landlord, QueryLandlordDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        LandlordExample example = new LandlordExample();
        LandlordExample.Criteria criteria = example.createCriteria();
        criteria.andTelEqualTo(landlord.getTel());
        List<Landlord> landlordList = landlordService.selectByExample(example);
        //验证房东是否存在
        if (landlordList.size() > 0) {
            modelAndView.addObject("msg", "该手机号已存在\n请勿重复添加");
        } else {
            if(landlord.getBankCard() == ""){
                landlord.setRegTime(new Date());
                if (landlordService.insertSelective(landlord) > 0) {
                    modelAndView.addObject("msg", "添加成功");
                } else {
                    modelAndView.addObject("msg", "添加失败");
                }
            }else {
                LandlordExample example1 = new LandlordExample();
                LandlordExample.Criteria criteria1 = example.createCriteria();
                criteria1.andBankCardEqualTo(landlord.getBankCard());
                List<Landlord> landlordList1 = landlordService.selectByExample(example1);
                if (landlordList1.size() > 0) {
                    modelAndView.addObject("msg", "该银行卡号已存在\n添加失败");
                }else {
                    landlord.setRegTime(new Date());
                    if (landlordService.insertSelective(landlord) > 0) {
                        modelAndView.addObject("msg", "添加成功");
                    } else {
                        modelAndView.addObject("msg", "添加失败");
                    }
                }
            }
        }
        modelAndView.addObject("query", query);
        modelAndView.setViewName("landlord/insert");
        return modelAndView;
    }

    @RequestMapping("deleteLandlordById.action")
    public String deleteLandlordById(Integer id, Model model) {
        if (landlordService.deleteByPrimaryKey(id) > 0) {
            model.addAttribute("msg", "删除成功");
        } else {
            model.addAttribute("msg", "删除失败");
        }
        return "forward:/landlord/findLandlordByQuery.action";
    }

    @RequestMapping("/deleteLandlordByIds.action")
    public String deleteLandlordByIds(@RequestParam(value = "id") Integer[] ids, Model model) {
        int index = 0;
        LandlordExample example = new LandlordExample();

        while (index < ids.length) {
            LandlordExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(ids[index]);
            example.or(criteria);
            index++;
        }

        //批量删除并或取被删除的数据的数量
        int count = landlordService.deleteByExample(example);
        if (count > 0) {
            model.addAttribute("msg", "成功删除" + count + "个房东");
        } else {
            model.addAttribute("msg", "删除失败");
        }
        return "forward:/landlord/findLandlordByQuery.action";
    }
}
