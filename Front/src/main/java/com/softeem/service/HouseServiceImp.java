package com.softeem.service;

import com.softeem.bean.po.House;
import com.softeem.bean.po.HouseExample;
import com.softeem.dao.HouseDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouseServiceImp implements HouseService {
    @Resource
    private HouseDAO houseDAO;

    @Override
    public long countByExample(HouseExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(HouseExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(House record) {
        return 0;
    }

    @Override
    public int insertSelective(House record) {
        return 0;
    }

    @Override
    public List<House> selectByExample(HouseExample example) {
        return houseDAO.selectByExample(example);
    }

    @Override
    public House selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(House record, HouseExample example) {
        return 0;
    }

    @Override
    public int updateByExample(House record, HouseExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(House record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(House record) {
        return 0;
    }
}
