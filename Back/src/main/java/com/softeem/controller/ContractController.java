package com.softeem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.softeem.bean.dto.PageDTO;
import com.softeem.bean.dto.QueryContractDTO;
import com.softeem.bean.po.Contract;
import com.softeem.bean.po.ContractExample;
import com.softeem.service.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Resource
    private ContractService contractService;

    @RequestMapping("/findContractByQuery.action")
    public ModelAndView findContractByQuery(QueryContractDTO query) {
        ModelAndView modelAndView = new ModelAndView();
        ContractExample example = new ContractExample();
        ContractExample.Criteria criteria = example.createCriteria();
        if (query.getQueryId() != null) {
            criteria.andIdEqualTo(query.getQueryId());
        }
        if (query.getQueryUserId() != null) {
            criteria.andUserIdEqualTo(query.getQueryUserId());
        }
        if (query.getQueryStatus() != null) {
            criteria.andStatusEqualTo(query.getQueryStatus());
        }
        //分页
        PageHelper.startPage(query.getPageNow(), PageDTO.PAGE_SIZE);
        List<Contract> contractList = contractService.selectByExample(example);
        //分页导航条
        PageInfo pageInfo = new PageInfo(contractList);
        pageInfo.setPageSize(PageDTO.PAGE_SIZE);
        pageInfo.setTotal(contractService.countByExample(example));
        //当前页，总页数
        PageDTO pageDTO = new PageDTO(query.getPageNow(), pageInfo.getPages());
        //
        modelAndView.addObject("contractList", contractList);
        modelAndView.addObject("query", query);
        modelAndView.addObject("pageDTO", pageDTO);
        modelAndView.setViewName("contract/index");
        return modelAndView;
    }

    @RequestMapping("deleteContractById.action")
    public String deleteContractById(Integer id, Model model) {
        if (contractService.deleteByPrimaryKey(id) > 0) {
            model.addAttribute("msg", "删除成功");
        } else {
            model.addAttribute("msg", "删除失败");
        }
        return "forward:/contract/findContractByQuery.action";
    }

    @RequestMapping("/deleteContractByIds.action")
    public String deleteContractByIds(@RequestParam(value = "id") Integer[] ids, Model model) {
        int index = 0;
        ContractExample example = new ContractExample();

        while (index < ids.length) {
            ContractExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(ids[index]);
            example.or(criteria);
            index++;
        }

        //批量删除并或取被删除的数据的数量
        int count = contractService.deleteByExample(example);
        if (count > 0) {
            model.addAttribute("msg", "成功删除" + count + "份合同");
        } else {
            model.addAttribute("msg", "删除失败");
        }
        return "forward:/contract/findContractByQuery.action";
    }
}
