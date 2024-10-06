package week3.stringtask;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "pots";
		
//		boolean anaBool=true;
		
		char[] t1=text1.toCharArray();
		char[] t2=text2.toCharArray();
				
		Arrays.sort(t1);
		Arrays.sort(t2);
		
		for (int i = 0; i < t1.length-1; i++) {
			if(t1[i]!=t2[i]) {
				System.out.println("Not a Anagram");
//				anaBool=false;
				break;
			}
		   if(t1[i]==t2[i]) {
				System.out.println("Anagram");
			}
				
	}
	}

}
