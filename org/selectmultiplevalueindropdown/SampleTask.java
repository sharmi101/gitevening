package org.selectmultiplevalueindropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement ddnmultiple=driver.findElement(By.id("fruits"));
		Select s=new Select(ddnmultiple);
		//s.selectByIndex(1);
		//s.selectByIndex(3);
		
		//s.selectByValue("banana");
		//s.selectByValue("grape");
		
		//s.selectByVisibleText("Apple");
		//s.selectByVisibleText("Orange");
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			
			WebElement WebElement=options.get(i);
			String text=WebElement.getText();
			System.out.println(text);
			s.selectByVisibleText(text);

		
		
		
		
			
			
			
		}
				
		
		
		
		
		
	}
	

}
