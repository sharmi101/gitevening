package org.getvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePrgm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtuser=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','shiva')",txtuser);
		Object obj=js.executeScript("return arguments[0].getAttribute('value')",txtuser);
		String s=(String)obj;
		System.out.println(s);
		
		
		
		
		
	}

}
