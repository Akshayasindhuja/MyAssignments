package week1.day2;

public class ChecktheNumberIsPositiveorNegative {

	public static void main(String[] args) {
				
			int num = -40;
			if(num<0) {
				System.out.println("the given number is negative number: "+ num);
			}else if (num>0) {
				System.out.println("the given number is positive number: "+num);
			}else {
				System.out.println("the given number is neither positive or negative: " +num);
			}
		}
	}