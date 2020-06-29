package com.softeem.service;

import com.softeem.bean.po.Contract;
import com.softeem.bean.po.ContractExample;
import com.softeem.dao.ContractDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContractServiceImp implements ContractService {
    @Resource
    private ContractDAO contractDAO;

    @Override
    public long countByExample(ContractExample example) {
        return contractDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(ContractExample example) {
        return contractDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return contractDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Contract record) {
        return 0;
    }

    @Override
    public int insertSelective(Contract record) {
        return 0;
    }

    @Override
    public List<Contract> selectByExample(ContractExample example) {
        return contractDAO.selectByExample(example);
    }

    @Override
    public Contract selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Contract record, ContractExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Contract record, ContractExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Contract record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Contract record) {
        return 0;
    }
}
