package week3.ajio;

import java.util.List;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AjioBrowser {

	public static void main(String[] args) {

		        //open empty browser
				ChromeDriver driver = new ChromeDriver();
				//load url
				driver.get("https://www.ajio.com/");
				//Maximize the window
				driver.manage().window().maximize();
				//Add implicitly wait
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//search bags 
				driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
				//click on the search button
				driver.findElement(By.xpath("//span[@class='ic-search']")).click();
				
				//"Gender" click on "Men"
				
				List<WebElement> gender = driver.findElements(By.xpath("//div[@class='facet-body']//following-sibling::li"));
				for (int i = 0; i <=gender.size()-1; i++) {
					if(gender.get(i).getText().contains("Men")){
						gender.get(i).click();
						break;
					}
				}
				
				//Under "Category" click "Fashion Bags"
				
				List<WebElement> category = driver.findElements(By.xpath("(//div[@class='facet-body'])[2]//following-sibling::li"));
                for (int i = 0; i <=category.size()-1; i++) {
					if(category.get(i).getText().contains("Fashion Bags")){
						category.get(i).click();
						break;
					}
				}
				
				
				
	}

}
