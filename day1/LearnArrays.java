package week1.day1;

import java.util.Arrays;
import java.util.Scanner;

public class LearnArrays {

	public static void main(String[] args) {
	
	int [] numbers = new int[25];
	System.out.println(Arrays.toString(numbers));
		
 int[] number = {12,65,32,45,25,8,9,6,6,6};
 int ad = number.length;
 System.out.println(ad);
 
 System.out.println(Arrays.toString(number));
 
 System.out.println(numbers[2]);
 
 char name[] = {'a','s','f','h','j'};
	System.out.println(Arrays.toString(name));
	System.out.println(name[3]);
	
	byte[] idname = {12,12,12,12,12,12,12,12,88,12,121,12};
	System.out.println(Arrays.toString(idname));
	
	double[] fmchannel = {93.50,102.1,97.1,100.5};
	System.out.println(Arrays.toString(fmchannel));
	double newfm = fmchannel.length;
	System.out.println(newfm);
	double[] copy = fmchannel.clone();
	System.out.println(Arrays.toString(copy));
	
	String[] idCardName = {"akshaya","sindhu", "Aksah","fgdj","kjjdhggsd"};
	System.out.println(Arrays.toString(idCardName));
	
	float number5;
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	number5 = input.nextFloat();
	System.out.println("The entered number is: " + number5);
	
	}

}
