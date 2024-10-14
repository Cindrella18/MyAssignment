package week3.abstrac.task3;

public class JavaConnection implements DatabaseConnection {

	
	
	public void connect() {
		System.out.println("Connect");
	}
	public void disconnect() {
		System.out.println("Disconnect");
	}
	public void executeUpdate() {
		System.out.println("Execute update");
	}
	
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		
	}
}
