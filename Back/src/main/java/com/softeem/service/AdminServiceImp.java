package com.softeem.service;

import com.softeem.bean.po.Admin;
import com.softeem.bean.po.AdminExample;
import com.softeem.dao.AdminDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImp implements AdminService {
    @Resource
    private AdminDAO adminDAO;

    @Override
    public long countByExample(AdminExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(AdminExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Admin record) {
        return 0;
    }

    @Override
    public int insertSelective(Admin record) {
        return 0;
    }

    @Override
    public List<Admin> selectByExample(AdminExample example) {
        return adminDAO.selectByExample(example);
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Admin record, AdminExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Admin record, AdminExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }
}
