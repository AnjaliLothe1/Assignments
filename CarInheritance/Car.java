package maamAssignment;

public abstract class Car {
	public Boolean isSedan;
	public String seats;

	Car(Boolean isSedan, String seats) {
		this.isSedan = isSedan;
		this.seats = seats;
	}

	Boolean getIsSedan() {
		return this.isSedan;
	}

	String getSeats() {
		return this.seats;
	}

	/*
	 * String getMileage() { System.out.println("Mileage"); return null; }
	 */
	abstract String getMileage();
}
