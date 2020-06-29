package com.softeem.service;

import com.softeem.bean.po.Salesman;
import com.softeem.bean.po.SalesmanExample;
import com.softeem.dao.SalesmanDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalesmanServiceImp implements SalesmanService {
    @Resource
    private SalesmanDAO salesmanDAO;

    @Override
    public long countByExample(SalesmanExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SalesmanExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Salesman record) {
        return 0;
    }

    @Override
    public int insertSelective(Salesman record) {
        return 0;
    }

    @Override
    public List<Salesman> selectByExample(SalesmanExample example) {
        return salesmanDAO.selectByExample(example);
    }

    @Override
    public Salesman selectByPrimaryKey(Integer id) {
        return salesmanDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Salesman record, SalesmanExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Salesman record, SalesmanExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Salesman record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Salesman record) {
        return 0;
    }
}
