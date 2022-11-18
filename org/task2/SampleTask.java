package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement acctrainer=driver.findElement(By.id("home-tab"));
		
		Actions acc=new Actions(driver);
		acc.moveToElement(acctrainer).perform();
		acctrainer.click();
		
		Thread.sleep(3000);
		
		
		
		WebElement texts=driver.findElement(By.xpath("//b[contains(text(),'Manager')]"));
		WebElement texta=driver.findElement(By.xpath("//p[contains(text(),'switch')]"));
		String name=texts.getText();
		String names=texta.getText();
		System.out.println(name);
		System.out.println(names);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
