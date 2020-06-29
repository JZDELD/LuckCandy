package com.softeem.service;

import com.softeem.bean.po.Room;
import com.softeem.bean.po.RoomExample;
import com.softeem.dao.ConfigurationDAO;
import com.softeem.dao.RoomDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImp implements RoomService {
    @Resource
    private RoomDAO roomDAO;
    @Resource
    private ConfigurationDAO configurationDAO;

    @Override
    public long countByExample(RoomExample example) {
        return roomDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(RoomExample example) {
        return roomDAO.deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(Integer id) {
        Room room = roomDAO.selectByPrimaryKey(id);
        configurationDAO.deleteByPrimaryKey(room.getConfigurationId());
        return roomDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Room record) {
        return 0;
    }

    @Override
    public int insertSelective(Room record) {
        return roomDAO.insertSelective(record);
    }

    @Override
    public List<Room> selectByExample(RoomExample example) {
        return roomDAO.selectByExample(example);
    }

    @Override
    public Room selectByPrimaryKey(Integer id) {
        return roomDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Room record, RoomExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Room record, RoomExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Room record) {
        return roomDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Room record) {
        return 0;
    }
}
