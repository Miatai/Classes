package com.training.classes.aggregation.task2;

// 2. ������� ������ ������ ����������, ��������� ������ ������, ���������. 
//������: �����, ������������, ������ ������, ������� �� ������� ����� ����������.
public class Car {

	private Engine engine;
	private Wheel[] wheels = new Wheel[4];
	private double fuelTank = 0;
	private String carModel;

	public Car(Engine engine, Wheel[] wheels, double fuelTank, String carModel) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.fuelTank = fuelTank;
		this.carModel = carModel;
	}

	public void drive() {
		engine.run();
		for (int i = 0; i < wheels.length; i++) {
			wheels[i].setSpinning(true);
		}
	}

	public void refuel(double fuel) {
		if (isFuelTankFull()) {
			System.out.println("�������� ����������. ��� �����.");
			return;
		}
		if (getRemainingPlaceInFuelTank() < fuel) {
			System.out.println(
					"������� ����������. ����� ������� ��� �������� ��������� ���������� � ���� �����. ���������� �����: "
							+ getRemainingPlaceInFuelTank());
		}

	}

	public void setFuelTank(double fuelTank) {

		this.fuelTank += fuelTank;
	}

	public double getRemainingPlaceInFuelTank() {
		return 100 - getFuelTank();
	}

	public boolean isFuelTankFull() {
		return getFuelTank() == 100 ? true : false;
	}

	public double getFuelTank() {
		return fuelTank;
	}

	public void printCarModel() {
		System.out.println(carModel);
	}

	public void changeWheel(int indexOfWheel) {
		wheels[indexOfWheel] = new Wheel();
	}

}
