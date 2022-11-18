package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePgrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().window().maximize();
	    WebElement btnsignIn=driver.findElement(By.name("proceed"));
	    btnsignIn.click();
	    Thread.sleep(3000);
	    Alert al=driver.switchTo().alert();
	    al.accept();
	    
	    
	    
	    
	    
	  
	    
		
		
	}
	
		
	}
	


