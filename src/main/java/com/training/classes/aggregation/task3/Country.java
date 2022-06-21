package com.training.classes.aggregation.task3;

import java.util.ArrayList;
import java.util.List;

// 3. Создать объект класса Государство, используя классы Область, Район, Город. 
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Country {
	private String name;
	private City capital;
	List<Region> regions = new ArrayList<>();

	public Country(String name, City capital, List<Region> regions) {
		super();
		this.name = name;
		this.capital = capital;
		this.regions = regions;
	}

	public Country(String name, City capital) {
		super();
		this.name = name;
		this.capital = capital;
	}

	public void printCapitalName() {
		System.out.println("Столица: " + capital.getName());
	}

	public int numberOfRegions() {
		return regions.size();
	}

	public double getCountryArea() {
		double result = 0;
		for (Region region : regions) {
			result = +region.getAreaOfAllDistricts();
		}
		return result;
	}
}
