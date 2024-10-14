package week1.day2;

public class MethodAnimal {
	
	public void forestName() {
		System.out.println("Forest Name is Amazon");
	}
	
	void animalName(String name) {
		System.out.println(name);
	}

	private int animalCount() {
	return 100;
	}
	public static void main(String[] args) {
		MethodAnimal ma=new MethodAnimal();
		ma.forestName();
		ma.animalName("Lion");
		int animalCount = ma.animalCount();{
			System.out.println(animalCount);
		}
    	LearnMethod lc=new LearnMethod();
    	lc.browserName("Firefox");

	}

}
