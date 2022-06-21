package com.training.classes.simpleclasses.task4;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//4. �������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������.
//�������� ������ � ������ �� ���� ��������� ���� Train, 
//�������� ����������� ���������� ��������� ������� �� ������� �������. 
//�������� ����������� ������ ���������� � ������, ����� �������� ������ �������������.
//�������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� ��������
//���������� ������ ���� ����������� �� ������� �����������.
public class Train implements Comparable<Train> {

	private String destinationName;
	private int trainNumber;
	private LocalTime departureTime;

	public Train(int trainNumber, String destinationName, LocalTime departureTime) {
		this.trainNumber = trainNumber;
		this.destinationName = destinationName;
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {

		return trainNumber + " - " + destinationName + " - " + departureTime.toString();
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public static Train getTrainByNumber(List<Train> trains, int number) {
		for (Train train : trains) {
			if (train.getTrainNumber() == number)
				return train;
		}
		return null;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public static void printTrainInfo(List<Train> trains, int trainNumber) {
		Train train = getTrainByNumber(trains, trainNumber);
		System.out.println("����� ������: " + train.getTrainNumber() + "\n����� ����������: "
				+ train.getDestinationName() + "\n����� ��������: " + train.getDepartureTime().toString());
	}

	public static List<Train> sortByDestinationAndDepartureTime(List<Train> trains) {
		Collections.sort(trains, (t1, t2) -> {
			int result = t1.destinationName.compareTo(t2.destinationName);
			if (result != 0) return result;
			return t1.departureTime.compareTo(t2.departureTime);
		});
		return trains;
	}

	public int compareTo(Train o) {
		return trainNumber - o.trainNumber;
	}

}
