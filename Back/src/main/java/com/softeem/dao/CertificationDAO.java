package com.softeem.dao;

import com.softeem.bean.po.Certification;
import com.softeem.bean.po.CertificationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificationDAO {
    long countByExample(CertificationExample example);

    int deleteByExample(CertificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Certification record);

    int insertSelective(Certification record);

    List<Certification> selectByExample(CertificationExample example);

    Certification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Certification record, @Param("example") CertificationExample example);

    int updateByExample(@Param("record") Certification record, @Param("example") CertificationExample example);

    int updateByPrimaryKeySelective(Certification record);

    int updateByPrimaryKey(Certification record);
}