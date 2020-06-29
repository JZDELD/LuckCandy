package com.softeem.dao;

import com.softeem.bean.po.Salesman;
import com.softeem.bean.po.SalesmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesmanDAO {
    long countByExample(SalesmanExample example);

    int deleteByExample(SalesmanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Salesman record);

    int insertSelective(Salesman record);

    List<Salesman> selectByExample(SalesmanExample example);

    Salesman selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Salesman record, @Param("example") SalesmanExample example);

    int updateByExample(@Param("record") Salesman record, @Param("example") SalesmanExample example);

    int updateByPrimaryKeySelective(Salesman record);

    int updateByPrimaryKey(Salesman record);
}