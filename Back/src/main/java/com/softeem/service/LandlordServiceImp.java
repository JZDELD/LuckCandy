package com.softeem.service;

import com.softeem.bean.po.Landlord;
import com.softeem.bean.po.LandlordExample;
import com.softeem.dao.LandlordDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LandlordServiceImp implements LandlordService {
    @Resource
    private LandlordDAO landlordDAO;

    @Override
    public long countByExample(LandlordExample example) {
        return landlordDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(LandlordExample example) {
        return landlordDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return landlordDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Landlord record) {
        return 0;
    }

    @Override
    public int insertSelective(Landlord record) {
        landlordDAO.insertSelective(record);
        System.out.println(record.getId() + "*******Service配置ID*****");
        return 1;
    }

    @Override
    public List<Landlord> selectByExample(LandlordExample example) {
        return landlordDAO.selectByExample(example);
    }

    @Override
    public Landlord selectByPrimaryKey(Integer id) {
        return landlordDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Landlord record, LandlordExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Landlord record, LandlordExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Landlord record) {
        return landlordDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Landlord record) {
        return 0;
    }
}
