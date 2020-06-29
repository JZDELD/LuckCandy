package com.softeem.service;

import com.softeem.bean.po.Region;
import com.softeem.bean.po.RegionExample;
import com.softeem.dao.RegionDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RegionServiceImp implements RegionService {
	@Resource
	private RegionDAO regionDAO;

	@Override
	public long countByExample(RegionExample example) {
		return 0;
	}

	@Override
	public int deleteByExample(RegionExample example) {
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return 0;
	}

	@Override
	public int insert(Region record) {
		return 0;
	}

	@Override
	public int insertSelective(Region record) {
		return 0;
	}

	@Override
	public List<Region> selectByExample(RegionExample example) {
		return regionDAO.selectByExample(example);
	}

	@Override
	public Region selectByPrimaryKey(Integer id) {
		return null;
	}

	@Override
	public int updateByExampleSelective(Region record, RegionExample example) {
		return 0;
	}

	@Override
	public int updateByExample(Region record, RegionExample example) {
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Region record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Region record) {
		return 0;
	}
}
