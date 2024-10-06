package week3.stringtask;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		//convert the string to array
		
		char[] od= test.toCharArray();
		
		for (int i = 0; i < od.length; i++) {
			if(i%2!=0) {
				char upperCase = Character.toUpperCase(od[i]);
				// //change the character to uppercase only if the index is odd
				System.out.println("Uppercase"+upperCase);
			}
			else {
			    System.out.println(od[i]);
			}
		}
	}

}
