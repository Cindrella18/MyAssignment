package week3.ajio;

import java.time.Duration;
import java.util.List;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AjioBrowser {

	public static void main(String[] args) throws InterruptedException {

		        //open empty browser
				ChromeDriver driver = new ChromeDriver();
				//load url
				driver.get("https://www.ajio.com/");
				//Maximize the window
				driver.manage().window().maximize();
				//Add implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
				Thread.sleep(3000);
				
				//Under "Category" click "Fashion Bags"
				
//				List<WebElement> category = driver.findElements(By.xpath("//label[contains(text(),'Fashion Bags')]"));
//                for (int i = 0; i <=category.size()-1; i++) {
//					if(category.get(i).getText().contains("Fashion Bags")){
//						category.get(i).click();
//						break;
//					}
//				}
				driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
				
				//Print the count of the items found.
				String itemCount = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
				System.out.print("Total Item Count of the Product:"+itemCount);
				
				//Get the list of brand of the products displayed in the page and print the list.
				
				List<WebElement> productList = driver.findElements(By.xpath("//div[@class='brand']/strong"));
				for (int i = 0; i <=productList.size()-1; i++) {
					String listProd = productList.get(i).getText();
					System.out.println("Product list display in page:"+listProd);
				}
				
				//Get the list of names of the bags and print it
				
				List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
				for (int i = 0; i <=bagName.size()-1; i++) {
					String bagList = bagName.get(i).getText();
					System.out.print("List names of the bag:"+bagList);
				}
	}
	

}
