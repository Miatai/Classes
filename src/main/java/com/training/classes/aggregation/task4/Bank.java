package com.training.classes.aggregation.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. 
//Реализовать поиск и сортировку счетов. 
//Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
public class Bank {
	private String name;
	private List<BankAccount> accounts = new ArrayList<>();

	public Bank(String name) {
		super();
		this.name = name;
	}

	public void addBankAccount(int number, Client owner, double money, boolean isBlocked) {
		accounts.add(new BankAccount(number, owner));
	}

	public BankAccount getBankAccountByNumber(int number) {
		for (BankAccount bankAccount : accounts) {
			if (bankAccount.getNumber() == number) return bankAccount;
		}
		System.out.println("Банковский счет не найден.");
		return null;
	}

	public void addMoneyToBankAccount(int number, Client owner, double money) {
		BankAccount account = getBankAccountByNumber(number);
		if (!account.checkOwner(owner)) {
			System.out.println("У вас нет доступа к этому счету!");
			return;
		}
		account.addMoney(money);
	}

	public void blockAccount(int number) {
		getBankAccountByNumber(number).setBlocked(true);
	}

	public void unblockAccount(int number) {
		getBankAccountByNumber(number).setBlocked(false);
	}

	public void printBankAccounts() {
		accounts.forEach(account -> System.out.println(account));
	}

	public void sortBankAccountsByNubmer() {
		Collections.sort(accounts);
	}

	public double sumOfAllMoney() {
		double result = 0;
		for (BankAccount bankAccount : accounts) {
			result += bankAccount.getBalance();
		}
		return result;
	}

	public double sumOfAllMoneyOfSpecifiedClient(Client client) {
		double result = 0;
		for (BankAccount bankAccount : accounts) {
			if (bankAccount.checkOwner(client)) result += bankAccount.getBalance();
		}
		return result;
	}

	public double sumOfAllPositiveBalance() {
		double result = 0;
		for (BankAccount bankAccount : accounts) {
			if (bankAccount.isBalancePositive()) result += bankAccount.getBalance();
		}
		return result;
	}

	public double sumOfAllNegativeBalance() {
		double result = 0;
		for (BankAccount bankAccount : accounts) {
			if (!bankAccount.isBalancePositive()) result += bankAccount.getBalance();
		}
		return result;
	}

}
