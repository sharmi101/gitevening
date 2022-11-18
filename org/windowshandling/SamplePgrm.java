package org.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SamplePgrm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtsearch=driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone"+Keys.ENTER);
		WebElement lnkiphone=driver.findElement(By.xpath("//span[text()='Apple iPhone 14 128GB Starlight']"));
		lnkiphone.click();
		
		String parentwindowId = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();
		for (String eachwindwindowId:allwindowId) {
		   if(!eachwindwindowId.equals(parentwindowId)) {
			   driver.switchTo().window(eachwindwindowId);
			   WebElement btncart=driver.findElement(By.id("add-to-cart-button"));
			   btncart.click();
		   }
		}
	}
		   
	
		
		
		
		
		
		
	}

	
