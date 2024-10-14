package week3.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNames {

	public static void main(String[] args) {
	
		String[] S= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> collNames=new ArrayList<String>();
		for (int i = 0; i < S.length; i++) {
			collNames.add(S[i]);
		}
		System.out.println(collNames);
		
		Collections.sort(collNames);
		System.out.println("Ascending Order"+collNames);
		
		//Reverse the Sorting String collection
		for(int i=collNames.size()-1;i>=0;i--) {
			System.out.println(collNames.get(i) +" ");
		}
	}

}
