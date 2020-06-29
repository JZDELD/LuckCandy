package com.softeem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.softeem.bean.dto.PageDTO;
import com.softeem.bean.dto.QueryUserDTO;
import com.softeem.bean.po.User;
import com.softeem.bean.po.UserExample;
import com.softeem.service.UserService;
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
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/findUserByQuery.action")
    public ModelAndView findUserByQuery(QueryUserDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (query.getQueryId() != null) {
            criteria.andIdEqualTo(query.getQueryId());
        }
        if (query.getQueryUserName() != null && query.getQueryUserName() != "") {
            criteria.andUserNameLike("%" + query.getQueryUserName() + "%");
        }
        if (query.getQueryHome() != null && query.getQueryHome() != "") {
            criteria.andHomeLike("%" + query.getQueryHome() + "%");
        }
        //分页
        PageHelper.startPage(query.getPageNow(), PageDTO.PAGE_SIZE);
        List<User> userList = userService.selectByExample(example);
        //分页导航条
        PageInfo pageInfo = new PageInfo(userList);
        pageInfo.setPageSize(PageDTO.PAGE_SIZE);
        pageInfo.setTotal(userService.countByExample(example));
        //当前页，总页数
        PageDTO pageDTO = new PageDTO(query.getPageNow(), pageInfo.getPages());
        //
        modelAndView.addObject("userList", userList);
        modelAndView.addObject("query", query);
        modelAndView.addObject("pageDTO", pageDTO);
        modelAndView.setViewName("user/index");
        return modelAndView;
    }

    @RequestMapping("/details.action")
    public ModelAndView details(Integer id, QueryUserDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.selectByPrimaryKey(id);
        modelAndView.addObject("user", user);
        modelAndView.addObject("query", query);
        modelAndView.setViewName("user/info");
        return modelAndView;
    }

    /*
     * 在 Spring MVC 的 Controller 中，Spring MVC 就可以
     * 将用户上传的数据绑定到 CommonsMultipartFile 类型的参数上。
     * 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
     */
    @RequestMapping("/updateUserInfo.action")
    public String updateUserInfo(User user, QueryUserDTO query, Model model,
                                 @RequestParam("avatarFile") CommonsMultipartFile avatarFile) throws IOException {
        String path = "F:/LuckCandy/user/" + user.getId();
        //
        if (!avatarFile.isEmpty()) {
            new File(path).mkdirs();
            path = path + "/avatarPic.png";
            avatarFile.transferTo(new File(path));
            user.setAvatar("/file/user/" + user.getId() + "/avatarPic.png");
        }

        if (userService.updateByPrimaryKeySelective(user) > 0) {
            model.addAttribute("msg", "更新成功");
        } else {
            model.addAttribute("msg", "更新失败");
        }

        String id = "id=" + user.getId();
        String pageNow = "&pageNow=" + query.getPageNow();
        String queryId = "&queryId=" + query.getQueryId();
        String queryUserName = "&queryUserName=" + query.getQueryUserName();
        String queryHome = "&queryHome=" + query.getQueryHome();

        return "forward:/user/details.action?" + id + pageNow + queryId + queryUserName + queryHome;
    }

    @RequestMapping("/insertUser.action")
    public ModelAndView insertUser(User user, QueryUserDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andTelEqualTo(user.getTel());
        List<User> userList = userService.selectByExample(example);
        //验证用户是否存在
        if (userList.size() > 0) {
            modelAndView.addObject("msg", "该手机号已存在\n请勿重复添加");
        } else {
            user.setRegTime(new Date());
            if (userService.insertSelective(user) > 0) {
                modelAndView.addObject("msg", "添加成功");
            } else {
                modelAndView.addObject("msg", "添加失败");
            }
        }
        modelAndView.addObject("query", query);
        modelAndView.setViewName("user/insert");
        return modelAndView;
    }

    @RequestMapping("deleteUserById.action")
    public String deleteUserById(Integer id, Model model) {
        if (userService.deleteByPrimaryKey(id) > 0) {
            model.addAttribute("msg", "删除成功");
        } else {
            model.addAttribute("msg", "删除失败");
        }
        return "forward:/user/findUserByQuery.action";
    }

    @RequestMapping("/deleteUserByIds.action")
    public String deleteUserByIds(@RequestParam(value = "id") Integer[] ids, Model model) {
        int index = 0;
        UserExample example = new UserExample();

        while (index < ids.length) {
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(ids[index]);
            example.or(criteria);
            index++;
        }

        //批量删除并或取被删除的数据的数量
        int count = userService.deleteByExample(example);
        if (count > 0) {
            model.addAttribute("msg", "成功删除" + count + "个用户");
        } else {
            model.addAttribute("msg", "删除失败");
        }
        return "forward:/user/findUserByQuery.action";
    }
}
