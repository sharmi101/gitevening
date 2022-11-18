package org.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http:www.greenstechnologys.com");
		WebElement texts=driver.findElement(By.xpath("//u[contains(text(),'Greens Technologys Software Training Centers in Chennai')]"));
		String name=texts.getText();
		System.out.println(name);
		
	}

}
