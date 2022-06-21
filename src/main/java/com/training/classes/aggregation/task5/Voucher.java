package com.training.classes.aggregation.task5;

public class Voucher implements Comparable<Voucher> {
	private String name;
	private Categories category = null;
	private int duration = 0;;
	private Transports transport = null;
	private Nutritions nutrition = null;

	public Voucher(String name, Categories category, int duration, Transports transport, Nutritions nutrition) {
		super();
		this.name = name;
		this.category = category;
		this.duration = duration;
		this.transport = transport;
		this.nutrition = nutrition;
	}

	public boolean isNameNullOrEmpty() {
		if (getName() == null) return true;
		return getName().isBlank() ? true : false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Transports getTransport() {
		return transport;
	}

	public void setTransport(Transports transport) {
		this.transport = transport;
	}

	public Nutritions getNutrition() {
		return nutrition;
	}

	public void setNutrition(Nutritions nutrition) {
		this.nutrition = nutrition;
	}

	@Override
	public String toString() {
		return "Voucher [name=" + name + ", category=" + category + ", duration=" + duration + ", transport="
				+ transport + ", nutrition=" + nutrition + "]\n";
	}

	@Override
	public int compareTo(Voucher o) {
		return name.compareTo(o.getName());
	}
}
