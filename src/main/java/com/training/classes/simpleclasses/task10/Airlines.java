package com.training.classes.simpleclasses.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.training.classes.simpleclasses.task9.Book;

public class Airlines {

	private List<Airline> airlines = new ArrayList<>();

	public Airlines() {}

	public Airlines(List<Airline> airlines) {
		super();
		this.airlines = airlines;
	}

	public List<Airline> getAirlines() {
		return new ArrayList<>(airlines);
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public void addAirline(Airline airline) {
		airlines.add(airline);
	}

	public void removeAirlineByIndex(int index) {
		airlines.remove(index);
	}

	@Override
	public String toString() {
		return " " + airlines.toString();
	}

	public Airlines getAirlinesByDestination(String destination) {
		Airlines result = new Airlines();
		for (Airline airline : airlines) {
			if (airline.getDestination().equals(destination))
				result.addAirline(airline);
		}
		return result;
	}
	
	public Airlines getAirlinerByDayOfWeek(DayOfWeek day) {
		Airlines result = new Airlines();
		for (Airline airline : airlines) {
			if(airline.getDaysOfWeek().contains(day)) 
				result.addAirline(airline);
		}
		return result;
	}
	
	public Airlines getAirlinesByDayOfWeekAndAdterSpecifiedTime(DayOfWeek day, LocalTime time){
		Airlines result = new Airlines();
		for (Airline airline : getAirlinerByDayOfWeek(day).getAirlines()) {
			if(airline.getDepartureTime().compareTo(time)>0) 
				result.addAirline(airline);
		}
		return result;
	}
}
