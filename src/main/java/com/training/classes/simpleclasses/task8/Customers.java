package com.training.classes.simpleclasses.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customers {
	private List<Customer> customers = new ArrayList<>();

	public Customers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customers() {}

	public List<Customer> getCustomers() {
		return new ArrayList<>(customers);
	}

	public void removeCustomerByIndex(int index) {
		customers.remove(index);
	}

	public void sortByFullName() {
		Collections.sort(customers);
	}

	@Override
	public String toString() {
		return " " + customers.toString();
	}

	public Customers customersByCreditCardInterval(int minRange, int maxRange) {
		Customers result = new Customers();
		for (int i = 0; i < customers.size(); i++) {
			int currentCreditCardNumber = customers.get(i).getCreditCardNumber();
			if (currentCreditCardNumber >= minRange && currentCreditCardNumber <= maxRange)
				result.addCustomer(customers.get(i));
		}
		return result;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

}
