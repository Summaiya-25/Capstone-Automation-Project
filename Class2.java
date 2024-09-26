package Automation_testing;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import common.Assert;

public class Class2 {
	
		public static void main(String[] args) throws Exception {
			
		
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	
		driver.get("https://qainterview.pythonanywhere.com/");
		
		
		//Placeholder= "Enter an integer"
		WebElement element = driver.findElement(By.id("number"));
		 
        System.out.println("Placeholder text: " + element.getAttribute("placeholder"));
    
        //TITLE "FACTORIAL"
	        String title=driver.getTitle();
	        System.out.println("Title: "+title);
	        
	        //URL contains 'https'
	        String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL is: " + currentUrl);
	        if (currentUrl.contains("https")) {
	            System.out.println("The URL contains 'https'.");
	        } else {
	            System.out.println("The URL does not contain 'https'.");
	        }

	  
    // Close the browser
    driver.quit();
}}

			 
