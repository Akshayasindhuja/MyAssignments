package week1.day1;

public class Car {

	public void drive(){
		System.out.println("drive Car");
	}
	public void applyBrake(){
		System.out.println("apply Brake");
	}
	public void soundHorn(){
		System.out.println("Sound Horn");
	}
	public void puncture(){
		System.out.println("Is Puncture");
	}
	public static void main(String[] args) {
		Car d = new Car();
		d.drive();
		Car e = new Car();
		e.applyBrake();
		Car f = new Car();
		f.soundHorn();	
		Car g = new Car();
		g.puncture();
	}
}
