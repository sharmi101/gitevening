package org.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		WebElement img=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		img.click();
		WebElement frame=driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(frame);
		img.click();
		
		
		
		
		
		
	}

}
