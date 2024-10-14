package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//create obj for action class
		Actions act=new Actions(driver);
		
		//find the element
		WebElement mouseHoverElement = driver.findElement(By.xpath("//span[text()='More']"));
		
		//use action class in the perform the action
		act.moveToElement(mouseHoverElement).perform();

	}

}
