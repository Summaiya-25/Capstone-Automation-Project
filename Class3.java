package Automation_testing;

import java.awt.Label;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Class3 {
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

	driver.get("https://qainterview.pythonanywhere.com/");
	
	driver.findElement(By.id("number")).sendKeys("4");
	Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@id='getFactorial']")).click();
	  Thread.sleep(1000);
	  WebElement result4 = driver.findElement(By.id("resultDiv"));
	  System.out.println(result4.getText());
	  
	   driver.navigate().refresh();
       Thread.sleep(1000);
	  //5
		driver.findElement(By.id("number")).sendKeys("5");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@id='getFactorial']")).click();
		  Thread.sleep(1000);
		  WebElement result5 = driver.findElement(By.id("resultDiv"));
		  System.out.println(result5.getText());
		 
		  //refresh5
		   driver.navigate().refresh();
	        Thread.sleep(1000);
	        
		  
			driver.findElement(By.id("number")).sendKeys("6");
			Thread.sleep(1000);
			 driver.findElement(By.xpath("//button[@id='getFactorial']")).click();
			  Thread.sleep(1000);  WebElement result6 = driver.findElement(By.id("resultDiv"));
			  System.out.println(result6.getText());
			  //refresh6
			   driver.navigate().refresh();
		        Thread.sleep(1000);
			  
				driver.findElement(By.id("number")).sendKeys("7");
				Thread.sleep(1000);
				 driver.findElement(By.xpath("//button[@id='getFactorial']")).click();
				  Thread.sleep(1000);
				  WebElement result7 = driver.findElement(By.id("resultDiv"));
				  System.out.println(result7.getText());
				  
				   driver.navigate().refresh();
			 
			        Thread.sleep(1000);
				  
					driver.findElement(By.id("number")).sendKeys("8");
					Thread.sleep(1000);
					 driver.findElement(By.xpath("//button[@id='getFactorial']")).click();
					  Thread.sleep(1000);
					  WebElement result8= driver.findElement(By.id("resultDiv"));
					  System.out.println(result8.getText());
					   driver.navigate().refresh();
				        Thread.sleep(1000);
					  
						driver.findElement(By.id("number")).sendKeys("9");
						Thread.sleep(1000);
						 driver.findElement(By.xpath("//button[@id='getFactorial']")).click();
						  Thread.sleep(1000);
						  WebElement result9 = driver.findElement(By.id("resultDiv"));
						  System.out.println(result9.getText());
						   driver.navigate().refresh();
					        Thread.sleep(1000);
						  
							driver.findElement(By.id("number")).sendKeys("10");
							Thread.sleep(1000);
							 driver.findElement(By.xpath("//button[@id='getFactorial']")).click();
							  Thread.sleep(1000);
							  WebElement result10 = driver.findElement(By.id("resultDiv"));
							  System.out.println(result10.getText());
							  driver.close();
							  
						
							

							  
}}
