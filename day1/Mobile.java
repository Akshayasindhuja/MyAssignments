package week1.day1;

public class Mobile {
	public void sendSMS() {
	System.out.println("From Oppo");
	}
public void makeCall() {
	System.out.println("Calling my Friend");
}
public static void main(String[] args) {
	Mobile Redmi = new Mobile();
	Redmi.sendSMS();
	Redmi.makeCall();
}
}
