package com.softeem.controller;

import com.softeem.bean.po.Admin;
import com.softeem.bean.po.AdminExample;
import com.softeem.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("/login.action")
    public String login(String account, String password, HttpServletRequest request) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(password);
        List<Admin> adminList = adminService.selectByExample(example);
        //
        if (adminList.size() > 0) {
            Admin admin = adminList.get(0);
            request.setAttribute("admin", admin);
            return "forward:/WEB-INF/jsp/admin/index.jsp";
        } else {
            request.setAttribute("msg", "error");
            return "forward:/login.jsp";
        }
    }

    @RequestMapping("/loginOut.action")
    public String loginOut(HttpServletRequest request){
        HttpSession session = request.getSession();
        //session销毁：session的监听器会自动调用sessionDestroyed()方法
        session.invalidate();
        //重定向到login.jsp
        return "forward:/login.jsp";
    }
}
