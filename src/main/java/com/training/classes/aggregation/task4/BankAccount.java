package com.training.classes.aggregation.task4;

public class BankAccount implements Comparable<BankAccount> {
	private int number;
	private Client owner;
	private double balance = 0;
	private boolean isBlocked = false;

	public BankAccount(int number, Client owner, double money, boolean isBlocked) {
		super();
		this.number = number;
		this.owner = owner;
		this.balance = money;
		this.isBlocked = isBlocked;
	}

	public BankAccount(int number, Client owner) {
		super();
		this.number = number;
		this.owner = owner;
	}

	public void addMoney(double money) {
		this.balance += money;
	}

	public boolean checkOwner(Client client) {
		return getOwner().equals(client) ? true : false;
	}

	@Override
	public int compareTo(BankAccount o) {
		return number - o.number;
	}

	public boolean isBalancePositive() {
		if (getBalance() > 0) return true;
		return false;
	}

	@Override
	public String toString() {
		return "BankAccount [Number=" + number + ", Owner=" + owner + ", balance=" + balance + ", isBlocked="
				+ isBlocked
				+ "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private Client getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

}
