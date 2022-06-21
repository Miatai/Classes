package com.training.classes.simpleclasses.task4;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, 
//добавьте возможность сортировки элементов массива по номерам поездов. 
//Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.
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
		System.out.println("Номер поезда: " + train.getTrainNumber() + "\nМесто назначения: "
				+ train.getDestinationName() + "\nВремя отправки: " + train.getDepartureTime().toString());
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
