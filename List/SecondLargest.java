package week3.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] num={3, 2, 11, 4, 6, 7};
		
		List<Integer> secLarge=new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			secLarge.add(num[i]);
		}
		System.out.println(secLarge);

		Collections.sort(secLarge);
		Integer LargeSecondNum = secLarge.get(secLarge.size()-2);
		System.out.println(LargeSecondNum);
	}

}
