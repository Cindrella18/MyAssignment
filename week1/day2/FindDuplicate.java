package week1.day2;
import java.util.Arrays;
public class FindDuplicate {

	public static void main(String[] args) {
	    int data[]= {34,45,67,89,34,45,47,47};
	    //for loop nested for loop
	    //if condition
	    //print the duplicate value
	    
	    //outer for loop
	    for (int i = 0; i < data.length; i++) {
			
	    	
	    	
	    	//inner for loop
	    	for (int j = i+1; j < data.length; j++) {
				if(data[i]==data[j]) {
					System.out.println("Duplicate value:"+data[j]);
				}
			}
		}
	    Arrays.sort(data);
	    for (int i = 0; i < data.length-1; i++) {
			if(data[i]==data[i+1]) {
				System.out.println(data[i+1]);
			}
		}
	  

	}

}
