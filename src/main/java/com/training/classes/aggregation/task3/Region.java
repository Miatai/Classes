package com.training.classes.aggregation.task3;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String name;

	private City regionalCenter;
	private List<District> districts = new ArrayList<>();

	public Region(String name, City regionalCenter, List<District> districts) {
		super();
		this.name = name;
		this.regionalCenter = regionalCenter;
		this.districts = districts;
	}

	public Region(String name, City regionalCenter) {
		super();
		this.name = name;
		this.regionalCenter = regionalCenter;
	}
	
	public double getAreaOfAllDistricts() {
		double result = 0;
		for (District district : districts) {
			result+=district.getArea();
		}
		return result;
	}

	public City getRegionalCenter() {
		return regionalCenter;
	}
}
