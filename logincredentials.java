package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Logincredentials {

	public static void main(String[] args) throws Exception {
		
		
		
		//Initialize WebDriver and Open Chrome Browser
		  WebDriver driver = new ChromeDriver();
		  
	   //Maximize the Browser Window
		   driver.manage().window().maximize();
		   
		   
	   // navigate to instagram page  
		   driver.get("https://www.instagram.com/"); 
		   
		   
		   
		//  login credentials //----------------------------------------------------------------
		   
		   
		   // Username
	        driver.findElement(By.name("username")).sendKeys("Your_Username");
	        Thread.sleep(3000);
	        
	        
	        
	      // Password  
	        driver.findElement(By.name("password")).sendKeys("Your_password");
	        Thread.sleep(3000);
	        
	        
	        
	     // login button
	        driver.findElement(By.cssSelector("button[type='submit']")).click();
	        Thread.sleep(3000);

	        
	        
	        // For save login info
	        Actions work = new Actions(driver);
	        Thread.sleep(5000);
	        work.moveToElement(driver.findElement(By.xpath("//button[contains(text(), 'Save info')]"))).click().perform();
	        Thread.sleep(5000);         
                   
		   
	}

}
