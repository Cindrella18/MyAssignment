package week1.day1.task1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		//load the URL
		driver.get("https://leafground.com/checkbox.xhtml");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded Requirements:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 
		//Click on the "Basic Checkbox."
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//Click on the "Notification Checkbox."
		WebElement ajax = driver.findElement(By.xpath("//h5[text()='Notification']//following::span[2]"));
		ajax.click();	
		
		//Verify that the expected message is displayed
		String checkedMsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
        System.out.println("Verify that the expected message is displayed:" +checkedMsg);
        ajax.click();
        Thread.sleep(2000);
        String uncheckedMsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
        System.out.println("Verify that the expected message is displayed:" +uncheckedMsg);
        
        //Click on your favorite language.
        List<WebElement> lang = driver.findElements(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td/label"));
        lang.get(0).click();
        lang.get(1).click();
        lang.get(2).click();
        lang.get(3).click();
        lang.get(4).click();
        
        
        
//        List<WebElement> lang = driver.findElements(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td/label"));
//        for (int i = 0; i <=lang.size()-1; i++) {
//			if((lang.get(i).getText().equals("Java"))&&(lang.get(i).getText().equals("Python"))&&(lang.get(i).getText().equals("Javascript"))) {
//				lang.get(i).click();
//				
//			}
//			
//		}
//        System.out.println("lang");
//        
        
        //Click on the "Tri-State Checkbox."
        WebElement tri = driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[3]"));
        tri.click();
        
        String triStateCheck = driver.findElement(By.xpath("//span[text()='State has been changed.']/following::p")).getText();
        System.out.println("Tri State CheckBox:" +triStateCheck);
        tri.click();
        Thread.sleep(2000);
        String triStateCheck1 = driver.findElement(By.xpath("//span[text()='State has been changed.']/following::p")).getText();
        System.out.println("Tri State CheckBox:" +triStateCheck1);
        tri.click();
        Thread.sleep(2000);
        String triStateCheck2 = driver.findElement(By.xpath("//span[text()='State has been changed.']/following::p")).getText();
        System.out.println("Tri State CheckBox:" +triStateCheck2);
        
        //Verify which tri-state option has been chosen.
      
        if (triStateCheck.contains("State = 1")&&(triStateCheck1.contains(("State = 2"))&&(triStateCheck2.contains("State = 0")))) {
			System.out.println("Tri State Checkbox is verified");
		}else {
			System.out.println("Tri State Checkbox is not verified");
		}

        //Click on the "Toggle Switch."
        WebElement toggle = driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following-sibling::div"));
        toggle.click();
        
        String check = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
        System.out.println("Toggle switch is Check" +check);
        toggle.click();
        Thread.sleep(2000);
        String uncheck = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
        System.out.println("Toggle switch is UnCheck" +uncheck);
        
      //Verify if the Checkbox is disabled.

       WebElement enableCheck = driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::span[2]"));
        
       boolean enabled = enableCheck.isEnabled();
       System.out.println("Verify if the Checkbox is disabled" +enabled);
       
       
       //Select multiple options on the page 
       driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
       driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[1]/div[1]/div[2]")).click();
       Thread.sleep(1000);
       //close 
       driver.close();
       
        
	}




}



