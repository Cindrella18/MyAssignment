package week3.abstrac.task3;

public abstract class MySqlConnection implements DBConnect{
	
	public void executeQuery() {
		System.out.println("Execute the query");
	}
}
