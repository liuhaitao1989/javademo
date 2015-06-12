package com.lht.demo;

public class Model {
	private String name;
	private String data;
	private String year;
	private String month;

	public Model(String name, String data, String year, String month) {
		super();
		this.name = name;
		this.data = data;
		this.year = year;
		this.month = month;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "{"+"name:"+getName()+",month:"+getMonth()+",year:"+getYear()+",data:"+getData()+"}";
	}
}
