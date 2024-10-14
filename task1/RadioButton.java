package week1.day1.task1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		//Load the URL https://leafground.com/button.xhtml .
		driver.get("https://www.leafground.com/radio.xhtml");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add the ImplicityWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}

}
