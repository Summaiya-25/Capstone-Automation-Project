package Automation_testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Capestone_Class1 {
	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	        driver.get("https://qainterview.pythonanywhere.com/");
		
	 boolean textBox=driver.findElement(By.xpath("//input[@id='number']")).isDisplayed();
		  System.out.println(textBox);
		  System.out.println("TextBox entered- Passed");
		  
		  driver.findElement(By.xpath("//input[@id='number']")).click();
		  System.out.println(textBox);
		  System.out.println("TextBox clicked-Passed");
		  Thread.sleep(1000);
		  
		  
		  boolean button=driver.findElement(By.xpath("//button[@id='getFactorial']")).isDisplayed();
		  System.out.println(button);
		  System.out.println("Calculate button - Passed");
		
		  driver.findElement(By.xpath("//button[@id='getFactorial']")).click();
		  System.out.println("button clicked - Passed");
		  Thread.sleep(1000);
	
		
		  boolean TC=driver.findElement(By.xpath("//a[normalize-space()='Terms and Conditions']")).isDisplayed();
		  System.out.println(button);
		  System.out.println("T&C link - Passed");
		  driver.findElement(By.xpath("//a[normalize-space()='Terms and Conditions']")).click();
		  System.out.println("T&C click - Failed");
		  Thread.sleep(1000);

	        // Navigate back
	        driver.navigate().back();
	      
	        // Validate the URL
	        String currentUrl = driver.getCurrentUrl();
	        if (currentUrl.equals("https://qainterview.pythonanywhere.com/")) {
	            System.out.println("Back button Passed");
	        } else {
	            System.out.println("Back button validation failed.");
	        }
	        
	        
	        //PRIVACY LINK
	        boolean privacy=driver.findElement(By.xpath("//a[normalize-space()='Privacy']")).isDisplayed();
			  System.out.println(button);
			  System.out.println("privacy link view - Passed");
			
	        driver.findElement(By.xpath("//a[normalize-space()='Privacy']")).click();
	        System.out.println("Privacy link - Failed");
			  Thread.sleep(1000);

		        // Navigate back
		        driver.navigate().back();

		        // Validate the URL
		        String currentUrl1 = driver.getCurrentUrl();
		        if (currentUrl1.equals("https://qainterview.pythonanywhere.com/")) {
		            System.out.println("Back button Passed");
		        } else {
		            System.out.println("Back button validation failed.");
		        }
		        	
		        
		        //REFRESH TAB
		        driver.navigate().refresh();
		        System.out.println("tab got refreshed - Passed");
		        Thread.sleep(5000);

		
		        driver.close();
	}}
		 

		
		
	