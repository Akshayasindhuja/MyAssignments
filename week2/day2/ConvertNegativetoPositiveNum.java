package week1.day2;

public class ConvertNegativetoPositiveNum {

	public static void main(String[] args) {
		int a=-65;
		if(a<0) {
			a=(-a);
	System.out.println("The number "+a+ " is converted from negative to positive.");
	}else if(a>0){
		System.out.println("The number "+a+" is a positive number and requires no conversion.");
	}else {
		System.out.println("The number "+a+" is neutral.");
	}
}
}