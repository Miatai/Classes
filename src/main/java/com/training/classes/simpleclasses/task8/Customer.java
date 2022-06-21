package com.training.classes.simpleclasses.task8;

// 8. ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � ����� toString(). 
//������� ������ �����, ������������ ������ ���� Customer, � ����������� �������������� � ��������. 
//������ �������� ������ ������ � ������� ��� ������ �� �������.
//����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
//����� � �������:
//a) ������ ����������� � ���������� �������;
//b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������
public class Customer implements Comparable<Customer> {
	private String firstName;
	private String secondName;
	private String patronymic;
	private String adress;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer(String firstName, String secondName, String patronymic, String adress, int creditCardNumber,
			int bankAccountNumber) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.patronymic = patronymic;
		this.adress = adress;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;

	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", secondName=" + secondName + ", patronymic=" + patronymic
				+ ", adress=" + adress + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]\n";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public int compareTo(Customer o) {
		int result = getSecondName().compareTo(o.getSecondName());
		if (result != 0) return result;
		result = getFirstName().compareTo(o.getFirstName());
		if (result != 0) return result;
		return getPatronymic().compareTo(o.getPatronymic());
	}

}
