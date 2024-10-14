package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCWinndowHandle {

	public static void main(String[] args) {
		//launch the browser
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//click the flight button
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();

		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window:"+parentWindow);

		//get all the window
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("All WIndow:"+allWindow);

		List<String> windowAddr=new ArrayList<String>(allWindow);

		String pTitle = driver.getTitle();
		System.out.println(pTitle);

		driver.switchTo().window(windowAddr.get(1));


		//get the title of the child 
		String cTitle = driver.getTitle();
		System.out.println("Child :"+cTitle);

		driver.switchTo().window(windowAddr.get(0));
		String currentTitle = driver.getTitle();
		System.out.println("Current Title:"+currentTitle);
		driver.close();

	}

}
