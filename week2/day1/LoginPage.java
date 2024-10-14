package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//sendkeys uses to pass the data to application that is sendkeys method work
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("DemoSalesManager");
		Thread.sleep(3000);
		user.clear();
		Thread.sleep(2000);
		user.sendKeys("DemoCsr");
		
		//that id attribute value is mismatch instead of username as Username gives as 
		//NoSuchElementException
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//ctrl+2->2option for the chose the WebELement
		//return type for findElement method is-> WebElement
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
//		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("SFA")).click();

	}

}
