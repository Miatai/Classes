package com.training.classes.simpleclasses.task6;

import java.text.DecimalFormat;

// 6. Составьте описание класса для представления времени. 
//Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) 
//с проверкой допустимости вводимых значений. 
//В случае недопустимых значений полей поле устанавливается в значение 0. 
//Создать методы изменения времени на заданное количество часов, минут и секунд.
public class Time {
	int hours;
	int minutes;
	int seconds;

	public Time(int hours, int minutes, int seconds) {
		setTime(hours, minutes, seconds);
	}

	public void setTime(int hours, int minutes, int seconds) {
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}

	public void setHours(int hours) {
		if (this.hours + hours < 0 || hours > 23) hours = 0;
		else this.hours = hours;
	}

	public void setMinutes(int minutes) {
		if (this.minutes + minutes < 0 || minutes > 59) minutes = 0;
		else this.minutes = minutes;
	}

	public void setSeconds(int seconds) {
		if (this.seconds + seconds < 0 || seconds > 59) seconds = 0;
		else this.seconds = seconds;
	}

	@Override
	public String toString() {
		return new DecimalFormat("#00").format(hours) + ":" + new DecimalFormat("#00").format(minutes) + ":"
				+ new DecimalFormat("#00").format(seconds);
	}
}
