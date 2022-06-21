package com.training.classes.simpleclasses.task2;

//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
//Добавьте конструктор, инициализирующий члены класса по умолчанию. 
//Добавьте set- и get- методы для полей экземпляра класса.
public class Test2 {

	private int firstNumber;
	private int secondNumber;

	public Test2(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public Test2() {
		this.firstNumber = 0;
		this.secondNumber = 0;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

}
