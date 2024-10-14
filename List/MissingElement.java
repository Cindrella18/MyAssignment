package week3.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

		int[] num={1, 2, 3, 4, 10, 6, 8};

		List<Integer> eleMiss=new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			eleMiss.add(num[i]);
		}
		System.out.println(eleMiss);

		Collections.sort(eleMiss);

		//Missing element compare
		for (int i = 0; i < eleMiss.size()-1; i++) {
			int current = eleMiss.get(i);
			int nextEle = eleMiss.get(i+1);
			if(current+1 !=nextEle) {
				System.out.println("Miising element is:"+(current+1));
			}



		}
	}
}
