package week1.day2;

public class LearnIfElse {

	public static void main(String[] args) {
		int num=9;
		if(num>0) {
			System.out.println("Positive Num:"+num);
		}else if(num==0){
			System.out.println("neutral value:"+num);
		}else {
			System.out.println("Negative value:"+num);
		}
		
		int mark=0;
		if(mark>=80) {
			System.out.println("A grade");
		}else if(mark>=60) {
			System.out.println("B grade");
		}else if(mark>=50) {
			System.out.println("C grade");
		}else {
			System.out.println("E");
		}

	}

}
