package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		int Array1[]={5,2,10,3,9,7};
		int Array2[]={1,2,7,4,6,9};
			for (int i = 0; i < Array1.length; i++) {
				for (int j = 0; j < Array2.length; j++) {
					if(Array1[i]==Array2[j]) {
					System.out.println(Array1[j]);
					}	
				}
			}
		}
	}