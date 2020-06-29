package com.softeem.service;



import com.softeem.bean.po.Room;
import com.softeem.bean.po.RoomExample;
import com.softeem.dao.RoomDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImp implements RoomService {
    @Resource
    private RoomDAO roomDAO;

    @Override
    public long countByExample(RoomExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(RoomExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Room record) {
        return 0;
    }

    @Override
    public int insertSelective(Room record) {
        return 0;
    }

    @Override
    public List<Room> selectByExample(RoomExample example) {
        return roomDAO.selectByExample(example);
    }

    @Override
    public Room selectByPrimaryKey(Integer id) {
        return null;
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
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Room record) {
        return 0;
    }
}
