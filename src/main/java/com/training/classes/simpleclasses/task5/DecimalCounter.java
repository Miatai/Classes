package com.training.classes.simpleclasses.task5;

// 5. ќпишите класс, реализующий дес€тичный счетчик, 
//который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
//ѕредусмотрите инициализацию счетчика значени€ми по умолчанию и произвольными значени€ми. 
//—четчик имеет методы увеличени€ и уменьшени€ состо€ни€, и метод
//позвол€ющее получить его текущее состо€ние. 
//Ќаписать код, демонстрирующий все возможности класса.
public class DecimalCounter {
	private int counter = 0;
	private int minRange = 0;
	private int maxRange;

	public DecimalCounter(int counter, int minRange, int maxRange) {
		if (counter < minRange || counter > maxRange) throw new IllegalArgumentException("Counter out of range!");
		this.counter = counter;
		this.minRange = minRange;
		this.maxRange = maxRange;

	}

	public DecimalCounter(int minRange, int maxRange) {
		this.counter = (int) ((Math.random() * (maxRange + 1 - minRange)) + minRange);
	}

	public DecimalCounter(int maxRange) {
		if (maxRange <= minRange) throw new IllegalArgumentException("Max range lower or equal min range!");
		this.maxRange = maxRange;
	}

	public void increaseByOne() {
		if (counter + 1 > maxRange) throw new IllegalArgumentException("Counter out of range!");
		counter++;
	}

	public void decreaseByOne() {
		if (counter - 1 < minRange) throw new IllegalArgumentException("Counter out of range!");
		counter--;
	}

	public int getCounter() {
		return counter;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public int getMinRange() {
		return minRange;
	}

	@Override
	public String toString() {
		return Integer.toString(counter);
	}
}
