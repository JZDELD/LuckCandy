package com.softeem.service;

import com.softeem.bean.po.Configuration;
import com.softeem.bean.po.ConfigurationExample;
import com.softeem.dao.ConfigurationDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConfigurationServiceImp implements ConfigurationService {
    @Resource
    private ConfigurationDAO configurationDAO;

    @Override
    public long countByExample(ConfigurationExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ConfigurationExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Configuration record) {
        return 0;
    }

    @Override
    public int insertSelective(Configuration record) {
        return configurationDAO.insertSelective(record);
    }

    @Override
    public List<Configuration> selectByExample(ConfigurationExample example) {
        return null;
    }

    @Override
    public Configuration selectByPrimaryKey(Integer id) {
        return configurationDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Configuration record, ConfigurationExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Configuration record, ConfigurationExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Configuration record) {
        return configurationDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Configuration record) {
        return 0;
    }
}
