package week1.day3;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] Array = {1,2,3,4,5,6,8};
		int length = Array.length;
		Arrays.sort(Array);		
			for (int i = 0; i < Array.length; i++) {	
				int j = i+1;
				if (Array[i]!=j) {
					System.out.println("The Missing element is :"+j+" "+ "Length is "+length);
				}
			}
		}
}