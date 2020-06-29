package com.softeem.dao;

import com.softeem.bean.po.Landlord;
import com.softeem.bean.po.LandlordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LandlordDAO {
    long countByExample(LandlordExample example);

    int deleteByExample(LandlordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Landlord record);

    int insertSelective(Landlord record);

    List<Landlord> selectByExample(LandlordExample example);

    Landlord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Landlord record, @Param("example") LandlordExample example);

    int updateByExample(@Param("record") Landlord record, @Param("example") LandlordExample example);

    int updateByPrimaryKeySelective(Landlord record);

    int updateByPrimaryKey(Landlord record);
}