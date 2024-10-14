package week1.day2;

public class LearnMethod {
	
	public void browserVersion(){
		System.out.println("Browser Version is BRV1");
	}
	
void browserName(String name){
	System.out.println(name);
}
private int cardPinNo() {
	return 54321;
}
	public static void main(String[] args) {
		LearnMethod lc=new LearnMethod();
		lc.browserName("Chrome");
		lc.browserVersion();
		int cardPinNo = lc.cardPinNo();
		System.out.println("CardPin Num:"+lc.cardPinNo());
		MethodAnimal ma=new MethodAnimal();
		ma.animalName("Zebra");
		ma.forestName();
		
	}
    
}
