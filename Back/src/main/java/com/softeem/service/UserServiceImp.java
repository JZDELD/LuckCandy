package com.softeem.service;

import com.softeem.bean.po.User;
import com.softeem.bean.po.UserExample;
import com.softeem.dao.UserDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserDAO userDAO;

    @Override
    public long countByExample(UserExample example) {
        return userDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return userDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return userDAO.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return userDAO.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
