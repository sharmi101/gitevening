package org.mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement acccourse=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(acccourse).perform();
		WebElement accoracle=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		acc.moveToElement(accoracle).perform();
		WebElement sqlcertification=driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		sqlcertification.click();
		
		
		
		
		
	}
	
	

}
