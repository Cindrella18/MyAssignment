package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		//launch the browser
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://leafground.com/table.xhtml");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				

				//to locate the table
				WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
				
				//to count the number of rows
				List<WebElement> allElements = table.findElements(By.xpath("tr"));
				
				int numOfRows = allElements.size();
				System.out.println("Rows count:"+numOfRows);
				
				List<WebElement> column = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
				
				int colCount = column.size();
				System.out.println("Column Count:"+colCount);
				
				//Retrieve the entire row value
				List<WebElement> row1Elements = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
				int size = row1Elements.size();
				
				for (int i = 0; i < size; i++) {
					String text = row1Elements.get(i).getText();
					System.out.println("row1 elements:"+text);
					
				}
				
				//to retrieve the entire row and column
				
				for (int i = 1; i <= numOfRows; i++) {
					//tr["+i+"]->stores as variable in xpath
					WebElement row = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
					
					//for coloumn count
					for (int j = 1; j <= colCount; j++) {
						String allElementsText = row.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]")).getText();
						System.out.println("All elements:"+allElementsText);
					}
				}
				
	}

}
