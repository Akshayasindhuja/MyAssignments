package week1.day3;

public class RemoveDuplicates {

public static void main(String[] args) {
	String text = "java basics are as a part of java sessions in java program ";	
	String[] split = text.split(" ");
	for (int i = 0; i < split.length; i++) {
		int count = 0;
		for (int j = i+1; j < split.length; j++) {
				if(split[i].equals(split[j])) {
					count++;
				if(count>0) {
					split[j]="";
				}
			}
		}
	}
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
}
}