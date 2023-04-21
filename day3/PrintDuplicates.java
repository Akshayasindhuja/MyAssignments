package week1.day3;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,1,18,16,17,19,15,17,1};
		int len = arr.length;
		System.out.println("The length of the array is: "+len);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
				System.out.println(arr[j]);
				
			}
		}
		}
	}
}
