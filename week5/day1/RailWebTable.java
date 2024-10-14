package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		// Step 1: Launch the URL
		driver.get("https://erail.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Step 2: Enter "MAS" in the "From" field
		WebElement fromInput = driver.findElement(By.id("txtStationFrom"));
		fromInput.clear();
		fromInput.sendKeys("MAS", Keys.TAB);

		// Step 3: Enter "MDU" in the "To" field
		WebElement toInput = driver.findElement(By.id("txtStationTo"));
		toInput.clear();
		toInput.sendKeys("MDU", Keys.ENTER);

		// Step 4: Uncheck "Sort on Date" checkbox
		driver.findElement(By.id("chkSelectDateOnly")).click();

		// Step 5: Get the train names
		List<WebElement> trainNameElements = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));
		
		for (int i = 0; i < trainNameElements.size(); i++) {
			String trainNameList = trainNameElements.get(i).getText();
			if(trainNameElements.get(i).getText().equals(trainNameElements.get(i+1).getText())) {
				 System.out.println("Duplicate train name found: " + trainNameList);
			}else {
				
				System.out.println("Train Name List:"+trainNameList);
			}
//			System.out.println("Train Name List:"+trainNameList);
		}

	}

}
