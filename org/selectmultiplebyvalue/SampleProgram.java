package org.selectmultiplebyvalue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleProgram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement ddnmultiple=driver.findElement(By.id("fruits"));
		Select s=new Select(ddnmultiple);
		
		List<WebElement> options = s.getOptions();
		int size=options.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
		    s.selectByIndex(i);
		    WebElement webElement=options.get(i);
		    String Attribute=webElement.getAttribute("value");
		    System.out.println(Attribute);
		    s.selectByValue(Attribute);
		    
		    
	
	
	
		
		
		
		
		
		
		
		
		
				
		}	
	}

}
