package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://www.testleaf.com");
		//maximaze the screen
		driver.manage().window().maximize();
		//java wait thread.sleep
		Thread.sleep(2000);
		//close the browser
		driver.close();
		
	}

}
