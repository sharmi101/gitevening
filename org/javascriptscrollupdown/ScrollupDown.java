package org.javascriptscrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement dest1=driver.findElement(By.xpath("//span[text()='Near HP Petrol Bunk, ']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",dest1);
		Thread.sleep(3000);
		WebElement dest2=driver.findElement(By.xpath("//a[@title='All Courses']"));
		js.executeScript("arguments[0].scrollIntoView(false)",dest2);
		
		
		
				
		
		
		
		
	}

}
