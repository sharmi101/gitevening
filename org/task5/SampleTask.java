package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtuser=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','greens')",txtuser);
		Object obj=js.executeScript("return arguments[0].getAttribute('value')",txtuser);
		
		String s=(String)obj;
		System.out.println(s);
		
		WebElement txtpass=driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','1234')",txtpass);
		Object c=js.executeScript("return arguments[0].getAttribute('value')",txtpass);
		String p=(String)c;
		System.out.println(p);
		
	
		
		
		
	}

}
