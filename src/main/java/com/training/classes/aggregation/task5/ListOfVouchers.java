package com.training.classes.aggregation.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfVouchers {
	private List<Voucher> vouchers = new ArrayList<>();

	public ListOfVouchers(List<Voucher> vouchers) {
		super();
		this.vouchers = vouchers;
	}

	public ListOfVouchers() {
		super();
	}

	public void addVoucher(Voucher voucher) {
		vouchers.add(voucher);
	}

	public void addAllVouchers(List<Voucher> vouchers) {
		this.vouchers.addAll(vouchers);
	}

	public void addAllVouchers(ListOfVouchers vouchers) {
		this.vouchers.addAll(vouchers.getVouchers());
	}

	public List<Voucher> getVouchers() {
		return new ArrayList<>(vouchers);
	}

	public void sortByName() {
		Collections.sort(vouchers);
	}

	public void sortByDuration() {
		Collections.sort(vouchers, (v1, v2) -> {
			return v1.getDuration() - v2.getDuration();
		});
	}

	public void sortByTransport() {
		Collections.sort(vouchers, (v1, v2) -> {
			return v1.getTransport().toString().compareTo(v2.getTransport().toString());
		});
	}

	public void sortByNutrition() {
		Collections.sort(vouchers, (v1, v2) -> {
			return v1.getNutrition().toString().compareTo(v2.getNutrition().toString());
		});
	}

	public void sortByCategories() {
		Collections.sort(vouchers, (v1, v2) -> {
			return v1.getCategory().toString().compareTo(v2.getCategory().toString());
		});
	}

	public ListOfVouchers getVouchersByName(String name) {
		ListOfVouchers result = new ListOfVouchers();
		for (Voucher voucher : vouchers) {
			if (voucher.getName().equals(name)) result.addVoucher(voucher);
		}
		return result;
	}

	public ListOfVouchers getVouchersByCategory(Categories category) {
		ListOfVouchers result = new ListOfVouchers();
		for (Voucher voucher : vouchers) {
			if (voucher.getCategory().equals(category)) result.addVoucher(voucher);
		}
		return result;
	}

	public ListOfVouchers getVouchersByTransport(Transports transport) {
		ListOfVouchers result = new ListOfVouchers();
		for (Voucher voucher : vouchers) {
			if (voucher.getTransport().equals(transport)) result.addVoucher(voucher);
		}
		return result;
	}

	public ListOfVouchers getVouchersByNutrition(Nutritions nutrition) {
		ListOfVouchers result = new ListOfVouchers();
		for (Voucher voucher : vouchers) {
			if (voucher.getNutrition().equals(nutrition)) result.addVoucher(voucher);
		}
		return result;
	}

	public ListOfVouchers getVouchersByDuration(int duration) {
		ListOfVouchers result = new ListOfVouchers();
		for (Voucher voucher : vouchers) {
			if (voucher.getDuration() == duration) result.addVoucher(voucher);
		}
		return result;
	}

	@Override
	public String toString() {
		return "ListOfVouchers [vouchers=\n" + vouchers + "]";
	}

}
