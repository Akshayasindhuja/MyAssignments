package week1.day1;

public class Vehicle {

	public void applyBrake() {
	}
	public void headlightOn(){
		System.out.println("Headlight is on");
	}
	
public static void main(String[]args) {
	Vehicle RoyalEnfield = new Vehicle();
	 RoyalEnfield.applyBrake();
	System.out.println("Royal Enfield is a superdooper Bike");
Vehicle car = new Vehicle();
car.headlightOn();
}
}
