package alertframe.week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Click the "Try It" button inside the frame

		String title = driver.switchTo().frame("iframeResult").getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Cindrella");
		
		//read the alert box
		String text = alert.getText();
		System.out.println(text);
		
		//- Click OK/Cancel in the alert that appears
		alert.accept();
		
		//Confirm the action is performed correctly by verifying the text displayed
		
		String text2 = driver.findElement(By.id("demo")).getText();
		System.out.println(text2);
		if(text2.contains("confirm")) {
			System.out.println("Verify thet text is display");
		}else {
			System.out.println("Verify thet text is not display");
		}
		
		driver.close();
	}

}
