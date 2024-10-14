package week1.day2;

import java.util.Arrays;
public class LearnArray {

	public static void main(String[] args) {
		int[] age= {1,2,3,4,5,6,7,8};
		//find the length of the array 
		//ctrl+2->2nd option
		int length = age.length;
		System.out.println("length of the array:"+length);
		
		//find the last value in array
		//age[8-1]
		System.out.println("last value:"+age[length-1]);
		
		//find the first value
		System.out.println("1st value:"+age[0]);
		
		//find the second largest value
		//sort
		Arrays.sort(age);
		System.out.println("second largest:"+age[length-2]);
		
		//find the second smallest num
		System.out.println("second smallest:"+age[1]);
		
		//ascending order
		for (int i = 0; i < age.length; i++) {
			System.out.println("ascending order:"+i);
		}
	}

}
