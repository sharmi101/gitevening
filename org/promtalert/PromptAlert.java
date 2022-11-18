package org.promtalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement prompt=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompt.click();
		
		WebElement btnprompt=driver.findElement(By.xpath("//button[contains(text(),'prompt')]"));
		btnprompt.click();
		Thread.sleep(3000);
		
		Alert al=driver.switchTo().alert();
		al.sendKeys("welcome user");
		al.accept();
		
		
		
		
		
		
		
		
		
	}
	

}
