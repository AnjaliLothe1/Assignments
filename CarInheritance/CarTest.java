package maamAssignment;
import java.util.*; 
public class CarTest {

	public static void main(String[] args) {
		CarExtendsDemo car=new CarExtendsDemo();
		Scanner sc=new Scanner(System.in);
		
		int carModel=sc.nextInt();
		int mileage=sc.nextInt();
		car.getCarInfo(carModel, mileage);
		
	}

}
