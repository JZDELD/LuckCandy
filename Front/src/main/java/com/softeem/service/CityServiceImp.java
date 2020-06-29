package com.softeem.service;

import com.softeem.bean.po.City;
import com.softeem.bean.po.CityExample;
import com.softeem.dao.CityDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImp implements CityService {
	@Resource
	private CityDAO cityDAO;

	@Override
	public long countByExample(CityExample example) {
		return 0;
	}

	@Override
	public int deleteByExample(CityExample example) {
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return 0;
	}

	@Override
	public int insert(City record) {
		return 0;
	}

	@Override
	public int insertSelective(City record) {
		return 0;
	}

	@Override
	public List<City> selectByExample(CityExample example) {
		return cityDAO.selectByExample(example);
	}

	@Override
	public City selectByPrimaryKey(Integer id) {
		return null;
	}

	@Override
	public int updateByExampleSelective(City record, CityExample example) {
		return 0;
	}

	@Override
	public int updateByExample(City record, CityExample example) {
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(City record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(City record) {
		return 0;
	}
}
