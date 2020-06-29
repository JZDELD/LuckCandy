package com.softeem.service;

import com.softeem.bean.po.Subway;
import com.softeem.bean.po.SubwayExample;
import com.softeem.dao.SubwayDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubwayServiceImp implements SubwayService {
    @Resource
    private SubwayDAO subwayDAO;

    @Override
    public long countByExample(SubwayExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SubwayExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Subway record) {
        return 0;
    }

    @Override
    public int insertSelective(Subway record) {
        return 0;
    }

    @Override
    public List<Subway> selectByExample(SubwayExample example) {
        return subwayDAO.selectByExample(example);
    }

    @Override
    public Subway selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Subway record, SubwayExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Subway record, SubwayExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Subway record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Subway record) {
        return 0;
    }
}
