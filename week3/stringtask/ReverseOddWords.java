package week3.stringtask;

public class ReverseOddWords  {

	public static void main(String[] args) {
		 String test = "I am a software tester";

	        String[] words = test.split(" ");
	        
	        for (int i = 0; i < words.length; i++) {
	            // Check if the position is odd 
	            if (i % 2 != 0) {
	                // Reverse the word at odd index
	                words[i] = new StringBuilder(words[i]).reverse().toString();
	            }
	        }
	        
	        // Join the modified words back into a string and print the result
	        String result = String.join(" ", words);
	        System.out.println("Modified string: " + result);
	    }

}
