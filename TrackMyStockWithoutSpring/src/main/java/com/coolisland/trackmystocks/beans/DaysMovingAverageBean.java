package com.coolisland.trackmystocks.beans;


public class DaysMovingAverageBean {
	private int id;
	private String name;
	
	
	
	public DaysMovingAverageBean(int id, String name) {
		setId(id);
		setName(name);
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
