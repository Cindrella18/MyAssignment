package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(obj);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("August@2024");
		driver.findElement(By.id("Login")).click();
		
		//it can have only one window id
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		String pTitle = driver.getTitle();
		System.out.println(pTitle);
		
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		
		//convert set into list
		List<String> childWindow=new ArrayList<String>(allWindows);


		//switch to child window
		driver.switchTo().window(childWindow.get(1));
		
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String cTitle = driver.getTitle();
		System.out.println(cTitle);
		//close child window
		driver.close();
		
		//switch back to parent page
		driver.switchTo().window(childWindow.get(0));
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();


		driver.quit();
		
		//close - it will close only current window or tab  & 
		//quit - it will close all opened window /tab
		//driver.quit();
       
        
	
	} 

}
