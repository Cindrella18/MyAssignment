package marathon.task1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PVRCinemaTask {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("cinemas-inactive")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@aria-label='Select Cinema']")).click();	
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[contains(text(),'INOX The Marina Mall')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Select Movie']")).click();

		driver.findElement(By.xpath("(//span[text()='LUBBER PANDHU'])[2]")).click();

		//select timing
		driver.findElement(By.xpath("//span[contains(text(),'04:10')]")).click();

		//Click on the book button

		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();

		//accept the terms and condition
		driver.findElement(By.xpath("//button[@class='sc-kLhKbu leNRZS reject-terms']")).click();

		//Select the seat number
		driver.findElement(By.xpath("//span[@id='CL.CLUB|I:3']")).click();

		//click to proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

		//Print the Seat info under book summary
		WebElement seatInfo = driver.findElement(By.xpath("//div[@class='seat-info']"));
		System.out.println("SeatInfo Under Book Summary :"+seatInfo.getText());

		//Print the grand total under book summary
		WebElement grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']"));
		System.out.println("GrandTotal Under Book Summary :" +grandTotal.getText());

		//Click Proceed 
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//close the pop up
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		// Print Your Current Page title
		String title = driver.getTitle();
		System.out.println("Current Page Title is:" +title);
		
		//close the browser
		driver.close();


		//		WebElement element = driver.findElement(By.xpath("(//span[text()='LUBBER PANDHU'])[4]"));
		//		element.click();
		//		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//		jse.executeScript("arguments[0]",element);
		//		element.click();
		//		Thread.sleep(1000);
	}

}
