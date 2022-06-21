package com.training.classes.aggregation.task4;

import java.util.Objects;

public class Client {
	private String fullName;

	@Override
	public int hashCode() {
		return Objects.hash(fullName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Client other = (Client) obj;
		return Objects.equals(fullName, other.fullName);
	}

}
