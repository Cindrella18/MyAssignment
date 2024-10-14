package week3.List;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] num={3, 2, 11, 4, 6,7};
		int[] num1= {1, 2, 8, 4, 9,7};
		
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			list.add(num[i]);
			
		}
		
		System.out.println(list);
		
		List<Integer> list1=new ArrayList<Integer>();
		for (int i = 0; i < num1.length; i++) {
			list1.add(num1[i]);
			
		}
		System.out.println(list1);
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list1.size(); j++) {
				//compare
				if(list.get(i)==list1.get(j)) {
					System.out.println("Intersection:"+list.get(i));
				}
			}
		}

	}

}
