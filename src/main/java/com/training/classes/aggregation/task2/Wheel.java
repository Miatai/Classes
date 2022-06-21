package com.training.classes.aggregation.task2;

public class Wheel {
	private boolean isPierced = false;
	private boolean isSpinning = false;

	public boolean isPierced() {
		return isPierced;
	}

	public void setPierced(boolean isPierced) {
		this.isPierced = isPierced;
	}

	public boolean isSpinning() {
		return isSpinning;
	}

	public void setSpinning(boolean isSpinning) {
		this.isSpinning = isSpinning;
		System.out.println("you spin me right round.");
	}
}
