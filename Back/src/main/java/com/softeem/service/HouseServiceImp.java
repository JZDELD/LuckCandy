package com.softeem.service;

import com.softeem.bean.po.ConfigurationExample;
import com.softeem.bean.po.House;
import com.softeem.bean.po.HouseExample;
import com.softeem.bean.po.RoomExample;
import com.softeem.dao.ConfigurationDAO;
import com.softeem.dao.HouseDAO;
import com.softeem.dao.RoomDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouseServiceImp implements HouseService {
    @Resource
    private HouseDAO houseDAO;

    @Resource
    private RoomDAO roomDAO;

    @Resource
    private ConfigurationDAO configurationDAO;

    @Override
    public long countByExample(HouseExample example) {
        return houseDAO.countByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByExample(HouseExample example) {
        List<House> houseList = houseDAO.selectByExample(example);
        RoomExample roomExample = new RoomExample();
        ConfigurationExample configurationExample = new ConfigurationExample();

        for (int index = 0; index < houseList.size(); index++) {
            RoomExample.Criteria criteria = roomExample.createCriteria();
            //
            ConfigurationExample.Criteria criteria1 = configurationExample.createCriteria();
            //
            criteria.andHouseIdEqualTo(houseList.get(index).getId());
            //
            criteria1.andIdEqualTo(houseList.get(index).getConfigurationId());
            //
            roomExample.or(criteria);
            //
            configurationExample.or(criteria1);
        }
        //删除房屋的同时把房间信息也删除
        roomDAO.deleteByExample(roomExample);
        //
        configurationDAO.deleteByExample(configurationExample);

        return houseDAO.deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(Integer id) {
        House house = houseDAO.selectByPrimaryKey(id);
        //删除配置
        configurationDAO.deleteByPrimaryKey(house.getConfigurationId());

        RoomExample example = new RoomExample();
        RoomExample.Criteria criteria = example.createCriteria();
        criteria.andHouseIdEqualTo(id);
        //删除房屋的同时把房间信息也删除
        roomDAO.deleteByExample(example);
        return houseDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(House record) {
        return 0;
    }

    @Override
    public int insertSelective(House record) {
        return houseDAO.insertSelective(record);
    }

    @Override
    public List<House> selectByExample(HouseExample example) {
        return houseDAO.selectByExample(example);
    }

    @Override
    public House selectByPrimaryKey(Integer id) {
        return houseDAO.selectByPrimaryKey(id);
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
        return houseDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(House record) {
        return 0;
    }
}
