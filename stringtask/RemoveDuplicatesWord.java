package week3.stringtask;

public class RemoveDuplicatesWord {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		  
        String[] words = text.split(" ");
        
        
        int count;
        
      
        for (int i = 0; i < words.length; i++) {
            count = 1;
            
            // Skip the empty strings
            if (words[i].equals("")) {
                continue;
            }
            
            
            for (int j = i + 1; j < words.length; j++) {
                // If duplicate word is found (case-sensitive)
                if (words[i].equals(words[j])) {
                    count++; // Increment count
                    words[j] = ""; // Replace duplicate word with an empty string
                }
            }
            
            // If more than one occurrence was found
            if (count > 1) {
                System.out.println("Duplicate word found: " + words[i]);
            }
        }
        
        
        System.out.print("Modified string without duplicates: ");
        for (String word : words) {
            if (!word.equals("")) {
                System.out.print(word + " ");
            }
        }
    }
}


