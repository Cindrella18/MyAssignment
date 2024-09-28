package marathon.task1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTaskSel {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		//Type "Bags for boys" in the Search box
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Bags of boys");
		element.sendKeys(Keys.RETURN); 
		
		// Choose the item in the result (bags for boys)
		WebElement firstSpan = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span"));
		WebElement secondSpan = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
		String resultText = firstSpan.getText() + secondSpan.getText();
		System.out.println(resultText);
		
		// Print the total number of results 
        driver.findElement(By.xpath("//input[@type='checkbox']/following::span[text()='Safari']")).click(); 
        driver.findElement(By.xpath("//input[@type='checkbox']/following::span[text()='Skybags']")).click();
        Thread.sleep(2000);

        //Select the first 2 brands in the left menu
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        
        // Choose New Arrivals (Sort)
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        
        //Print the first resulting bag info name
        WebElement name = driver.findElement(By.xpath("//span[text()='Skybags']"));
        System.out.println(name.getText());
        
        ////Print the first resulting bag info discounted price
        WebElement discountName = driver.findElement(By.xpath("//span[text()='2,100']"));
        System.out.println(discountName.getText());
        
        //Get the page title and close the browser(driver.close())
        driver.close();



	}

}
