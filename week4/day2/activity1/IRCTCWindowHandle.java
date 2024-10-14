package week4.day2.activity1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCWindowHandle {


	public static void main(String[] args) {

		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Method 1
		//				driver.get("https://www.irctc.co.in/nget/");
		//				
		//				String pTitle = driver.getTitle();
		//				System.out.println(pTitle);
		//				
		//				//flights click
		//				
		//				driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		//			
		//				

		//				Set<String> allWindows=driver.getWindowHandles();
		//				System.out.println(allWindows);
		//				
		//				//convert set to list
		//				List<String> windows=new ArrayList<String>(allWindows);
		//				
		//				driver.switchTo().window(windows.get(1));
		//				
		//				String cTitle=driver.getTitle();
		//				System.out.println(cTitle);
		//		
		////				driver.close();
		//				
		//
		//			    driver.switchTo().window(windows.get(0));
		////			    
		//			    driver.quit();	

		//Method 2 for loop



		driver.get("https://www.irctc.co.in/nget/");

		String pTitle = driver.getTitle();
		System.out.println(pTitle);

		//flights click

		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();



		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);

		Iterator<String> itr = allWindows.iterator();
		String pWindow = itr.next();
		String cWindow = itr.next();
		WebDriver parentTitleWindow = driver.switchTo().window(pWindow);
		System.out.println(parentTitleWindow.getTitle());
		WebDriver childTitleWindow = driver.switchTo().window(cWindow);
		System.out.println(childTitleWindow.getTitle());
		
		driver.switchTo().window(cWindow).close();
		driver.switchTo().window(pWindow).close();

	}



}


