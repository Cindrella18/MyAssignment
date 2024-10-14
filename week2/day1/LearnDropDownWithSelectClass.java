package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDownWithSelectClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/select.xhtml");
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		
		//create a object for select class
		Select dd=new Select(element);
		//object.method()
       // obj.selectByIndex(2);
		
       List<WebElement> options = dd.getOptions();
        
       int size=options.size();
       System.out.println(size);
       for(int i=0;i<options.size();i++) {
    	   Thread.sleep(2000);
    	   if(i==1||i==4) {
    	   options.get(i).click();
    	   }
       }
       driver.close();

	}

}
