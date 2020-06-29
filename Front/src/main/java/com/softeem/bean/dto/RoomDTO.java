package com.softeem.bean.dto;

import com.softeem.bean.po.Configuration;
import com.softeem.bean.po.House;
import com.softeem.bean.po.Room;
import com.softeem.bean.po.Salesman;

import java.util.List;

public class RoomDTO extends Room {
	private House house;
	private Configuration configuration;
	private Salesman salesman;
	private String fm;//封面
	private List<String> imageList;

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

	public String getFm() {
		return fm;
	}

	public void setFm(String fm) {
		this.fm = fm;
	}

	public List<String> getImageList() {
		return imageList;
	}

	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}
}
