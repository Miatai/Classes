package com.training.classes.aggregation.task3;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String name;
	private List<City> cities = new ArrayList<>();
	private double area;

	public District(String name, List<City> cities, double area) {
		super();
		this.name = name;
		this.cities = cities;
		this.area = area;
	}

	public District(String name, List<City> cities) {
		super();
		this.name = name;
		this.cities = cities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
