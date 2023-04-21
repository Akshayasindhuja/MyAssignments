package week1.day1;

public class Practicemethodandobjects {

	public void learncallingobjects() {
		System.out.println("I m trying to create a method, calling an object and run it as a program and check the console for printout.");
	}
	
	public void HelloSelenium() {
		System.out.println("Trying and practising more to create methods and calling the program..");
	}
		 
	public static void main(String[] args) {
		Practicemethodandobjects Learn = new Practicemethodandobjects();
		Learn.learncallingobjects();
		Practicemethodandobjects Test = new Practicemethodandobjects();
 	 	Test.HelloSelenium();
	}
}
