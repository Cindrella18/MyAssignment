package week1.day1.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		//Initialize the WebDriver (ChromeDriver).
				ChromeDriver driver = new ChromeDriver();
				//Load the URL http://leaftaps.com/opentaps/.
				driver.get("http://leaftaps.com/opentaps/");
				//Maximize the browser window
				driver.manage().window().maximize();
				//Enter the user name as "DemoSalesManager"
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				//Enter the Password as"crmsfa"
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click on the login Button
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click on the CRM/SFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Click on leads tap
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				//Click "Find leads."
				driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
				//Click on the "Phone" tab.
				driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
				//Enter the phone number.
				WebElement phoneCOde = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
				phoneCOde.clear();
				phoneCOde.sendKeys("8");
				driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
				//Click the "Find leads" button.
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
	}

}
