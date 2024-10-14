package week1.day2;

public class JumpStmt {

	public static void main(String[] args) {
		int val=10;
		for (int i = 0; i <=val; i++) {
			if(i==6) {
				break;
		}
			System.out.println(i);
	}
for (int i = 0; i <=val; i++) {
	if(i==6) {
		continue;
	}
	System.out.println(i);
}
	}
}
