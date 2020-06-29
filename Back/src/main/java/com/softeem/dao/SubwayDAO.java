package com.softeem.dao;

import com.softeem.bean.po.Subway;
import com.softeem.bean.po.SubwayExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubwayDAO {
    long countByExample(SubwayExample example);

    int deleteByExample(SubwayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Subway record);

    int insertSelective(Subway record);

    List<Subway> selectByExample(SubwayExample example);

    Subway selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Subway record, @Param("example") SubwayExample example);

    int updateByExample(@Param("record") Subway record, @Param("example") SubwayExample example);

    int updateByPrimaryKeySelective(Subway record);

    int updateByPrimaryKey(Subway record);
}