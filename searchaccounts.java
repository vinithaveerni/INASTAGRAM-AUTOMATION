package project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchaccounts {

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

	        
	        
	        //  save login info
	        Actions work = new Actions(driver);
	        Thread.sleep(5000);
	        
	        work.moveToElement(driver.findElement(By.xpath("//button[contains(text(), 'Save info')]"))).click().perform();
	        Thread.sleep(5000);  
	        
	        //Search for the Desired Account
	        work.moveToElement(driver.findElement(By.xpath("//a[@href='#']"))).click().sendKeys("desire account").perform();
            Thread.sleep(5000);
            
            //Select the Account from the Search Results
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='x9f619 x78zum5 xdt5ytf x1iyjqo2 x6ikm8r x1odjw0f xh8yej3 xocp1fn']//a")));

            for (WebElement result : list) {
                if (result.getText().contains("desire account")) {
                    work.click(result).perform();
                    Thread.sleep(3000);
                }
            }
	}

}
