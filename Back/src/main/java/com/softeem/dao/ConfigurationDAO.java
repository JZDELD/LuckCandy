package com.softeem.dao;

import com.softeem.bean.po.Configuration;
import com.softeem.bean.po.ConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationDAO {
    long countByExample(ConfigurationExample example);

    int deleteByExample(ConfigurationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Configuration record);

    int insertSelective(Configuration record);

    List<Configuration> selectByExample(ConfigurationExample example);

    Configuration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Configuration record, @Param("example") ConfigurationExample example);

    int updateByExample(@Param("record") Configuration record, @Param("example") ConfigurationExample example);

    int updateByPrimaryKeySelective(Configuration record);

    int updateByPrimaryKey(Configuration record);
}