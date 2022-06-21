package com.training.classes.aggregation.task2;

public class Engine {
	private boolean isRunning = false;

	public void run() {
		setRunning(true);
		System.out.println("Engine is running!");
	}

	private void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public boolean isRunning() {
		return isRunning;
	}

}
