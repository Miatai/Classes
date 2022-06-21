package com.training.classes.simpleclasses.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

// 10. ������� ����� Airline, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � ����� toString(). 
//������� ������ �����, ������������ ������ ���� Airline, � ����������� �������������� � ��������. 
//������ �������� ������ ������ � ������� ��� ������ �� �������.
//Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
//����� � �������:
//a) ������ ������ ��� ��������� ������ ����������;
//b) ������ ������ ��� ��������� ��� ������;
//c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
public class Airline {
	private String destination;
	private int flightNumber;
	private String aircraftType;
	private LocalTime departureTime;
	private Set<DayOfWeek> daysOfWeek = new HashSet<>();

	public Airline(String destination, int flightNumber, String aircraftType, LocalTime departureTime,
			Set<DayOfWeek> daysOfWeek) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.daysOfWeek = daysOfWeek;
	}

	public Airline() {}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public Set<DayOfWeek> getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(Set<DayOfWeek> daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", aircraftType="
				+ aircraftType + ", departureTime=" + departureTime + ", daysOfWeek=" + daysOfWeek + "]\n";
	}

}
