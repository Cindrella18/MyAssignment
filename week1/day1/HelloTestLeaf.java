package week1.day1;

public class HelloTestLeaf {

	//main ctrl+space
	public static void main(String[] args) {
		int num=-5;
		if(num>0)
		{
			System.out.println("positive number:" +num);
		}else
		{
			System.out.println("Number is:"+num);
		}
		//sysout ctrl+space
		int releaseYear=1998;
		String browserName="firefox";
		float browserVersion=100.2f;
		boolean isVisible=true;
		char browserLogo='f';
		System.out.println("Welcome to TestLeaf");
		System.out.println("All datatypes: " + releaseYear + ", " + browserName + ", " + browserVersion + ", " + isVisible + ", " + browserLogo);
		
	}

}
