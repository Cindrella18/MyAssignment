package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {

		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take screenshot of the entirepage
		//File -> class
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		//add destination
		//homepage.png->user defined name for the screenshot of page
		File dest=new File("./Snaps/homepage.png");
		
		//combine source and destination
		
		FileUtils.copyFile(source, dest);
		
		
		//To take screenshot of webelement
		
		//To find the element
		WebElement usernameTxtField = driver.findElement(By.id("login"));
//		WebElement usernameTxtField = driver.findElement(By.id("username"));
		File source1 = usernameTxtField.getScreenshotAs(OutputType.FILE);
//		File source2 = username.getScreenshotAs(OutputType.FILE);
		
		//path need to store
		
		File dest2=new File("./Snaps/UsernameField.png");
		
		//combine the source and dest
		FileUtils.copyFile(source1, dest2);
		
		
		
		

	}

}
