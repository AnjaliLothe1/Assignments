package maamAssignment;

class WagonR extends Car {
	String mileage;

	WagonR(int mileage) {
		super(false, "4");
		this.mileage = mileage + " kmpl";
		System.out.println("A WagonR is not Sedan, is " + getSeats()+ "-seater,and has a mieage of a around " + getMileage());
		System.out.println("A WagonR is a sedan=" + getIsSedan() + ",no of seats=" + getSeats() + ",mileage=" + getMileage());
		   
	}

	public String getMileage() {
		return this.mileage;
	}
}

class HondaCity extends Car {
	public String mileage;

	public HondaCity(int mileage) {
		super(true, "4");
		this.mileage = mileage + " kmpl";
		System.out.println("A HondaCity is Sedan, is " + getSeats()+ "-seater,and has a mieage of a around " + getMileage());
		
	}

	String getMileage() {
		return this.mileage;
	}
}

class InnovaCrysta extends Car {
	public String mileage;

	public InnovaCrysta(int mileage) {
		super(false, "6");
		this.mileage = mileage + " kmpl";
		System.out.println("A InnovaCrysta is not Sedan, is " + getSeats()+ "-seater,and has a mieage of a around " + getMileage());
	}

	String getMileage() {
		return this.mileage;
	}
}

public class CarExtendsDemo {
	public Car getCarInfo(int carModel, int mileage) {
		if (carModel == 0) {
			return new WagonR(mileage);
		} else if (carModel == 1) {
			return new HondaCity(mileage);
		} else if (carModel == 2) {
			return new InnovaCrysta(mileage);
		}
		return null;
	}

}
