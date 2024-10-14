package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnClickAndHold {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		
		WebElement firstElement = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement secondElement = driver.findElement(By.xpath("//li[text()='Item 2']"));
		
		act.clickAndHold(firstElement).clickAndHold(secondElement).perform();
		driver.close();
		
	}

}
