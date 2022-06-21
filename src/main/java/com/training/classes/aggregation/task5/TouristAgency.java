package com.training.classes.aggregation.task5;

// 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
//(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
//Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class TouristAgency {
	private String name;
	private ListOfVouchers vouchers;

	public TouristAgency(String name, ListOfVouchers vouchers) {
		super();
		this.name = name;
		this.vouchers = vouchers;
	}

	public String printVouchers() {
		return vouchers.toString();
	}

	public ListOfVouchers getVouchers() {
		return vouchers;
	}

	public ListOfVouchers searchByParameters(Voucher searchingVoucher) {
		ListOfVouchers result = vouchers;
		if (!searchingVoucher.isNameNullOrEmpty()) {
			result = result.getVouchersByName(searchingVoucher.getName());
		}
		if (searchingVoucher.getCategory() != null) {
			result = result.getVouchersByCategory(searchingVoucher.getCategory());
		}
		if (searchingVoucher.getTransport() != null) {
			result = result.getVouchersByTransport(searchingVoucher.getTransport());
		}
		if (searchingVoucher.getNutrition() != null) {
			result = result.getVouchersByNutrition(searchingVoucher.getNutrition());
		}
		if (searchingVoucher.getDuration() != 0) {
			result = result.getVouchersByDuration(searchingVoucher.getDuration());
		}
		return result;
	}

}
