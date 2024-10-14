package week3.polymorph.task2;

public class APIClient {
	
	public String sendRequest(String endpoint) {
		String e1="This is the endppoint send request";
		System.out.println(e1);
		return endpoint;
		
	}
	
	public String sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		String e2="This is 2nd endpoint";
		System.out.println(e2);
		String r1="This is the request body";
		System.out.println(r1);
		String s1="Whether the boolean is true or false";
		System.out.println(s1);
		return requestBody;
		
	}

	public static void main(String[] args) {
 
	APIClient api=new APIClient();
	api.sendRequest("e1");
	api.sendRequest("e1", "r1", true);
	
		
		
		
		


	}

}
