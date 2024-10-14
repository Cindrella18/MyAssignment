package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click open 
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//To get the addresss of parent window
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window:"+parentWindow);
		
		//to get all the windnow open address
		Set<String> allOpenAddr = driver.getWindowHandles();
		System.out.println("Address of all open address:"+allOpenAddr);
       
		//convert set into list
		//declare empty list
		
		List<String> allAddress=new ArrayList<String>(allOpenAddr);
		
		//get title
		String parentTitle = driver.getTitle();
		System.out.println("Parent Title:"+parentTitle);
		
		//switch from parent to child
		driver.switchTo().window(allAddress.get(1));
		
		//get the child title
		String childWindow = driver.getTitle();
		System.out.println("Child Window:"+childWindow);
		
		//close the browser
		driver.close();
		
		//transfer the driver focus to parent window
		
		driver.switchTo().window(allAddress.get(0));
		
		//get the title of cuurent window
		String currentTitle = driver.getTitle();
		System.out.println("Current Window Title:"+currentTitle);
	}

}
