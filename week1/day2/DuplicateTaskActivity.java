package week1.day2;

import java.util.Arrays;

public class DuplicateTaskActivity {

	public static void main(String[] args) {
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println("Duplicate Number is:"+num[j]);
				}
			}
		}
		Arrays.sort(num);
		for (int i = 0; i < num.length-1; i++) {
			if(num[i]==num[i+1]) {
				System.out.println(num[i]);
			}
		}
		

	}

}
