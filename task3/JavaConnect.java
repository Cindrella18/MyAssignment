package week3.abstrac.task3;

public class JavaConnect extends MySqlConnection implements DBConnect {

	@Override
	public void connect() {
		System.out.println("Connection in Db");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect in the DB");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the Update valid");
		
	}
	
	public static void main(String[] args) {
		JavaConnect j=new JavaConnect();
		j.connect();
		j.disconnect();
		j.executeUpdate();
		j.executeQuery();
	}

}
