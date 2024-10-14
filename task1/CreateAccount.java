package week1.day1.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//username->DemoSalesManager
		//password->crmsfa
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the login Button
		driver.findElement(By.className("decorativeSubmit")).click();;
		//Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("Cindu");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Enter a Number Of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("4	");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the Title is displayed correctly
		String title = driver.getTitle();
		System.out.println("Current Page title is :" + title);
		if(title.contains("Create Account")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not verified");
		}
		//Close the browser window
		driver.close();

	}


}
