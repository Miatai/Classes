package com.training.classes.simpleclasses.task1;

// 1. Создайте класс Test1 двумя переменными. 
//Добавьте метод вывода на экран и методы изменения этих переменных. 
//Добавьте метод, который находит сумму значений этих переменных, 
//и метод, который находит наибольшее значение из этих двух переменных.
public class Test1 {
	private int firstNumber;
	private int secondNumber;

	public Test1(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	private int getFirstNumber() {
		return firstNumber;
	}

	private int getSecondNumber() {
		return secondNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void printFirstNumber() {
		System.out.println(getFirstNumber());
	}

	public void printSecondNumber() {
		System.out.println(getSecondNumber());
	}

	public int sumOfNumbers() {
		return getFirstNumber() + getSecondNumber();
	}

	public int compareNumbers() {
		if (getFirstNumber() == getSecondNumber()) return 0;
		return getFirstNumber() > getSecondNumber() ? 1 : -1;
	}

}
