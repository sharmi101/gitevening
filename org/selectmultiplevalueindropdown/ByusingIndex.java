package org.selectmultiplevalueindropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByusingIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement ddnmultiple=driver.findElement(By.id("fruits"));
		Select s=new Select(ddnmultiple);
		
		//List<WebElement> options = s.getOptions();
		//int size=options.size();
		//System.out.println(size);
		//for(int i=0;i<size;i++) {
		    //s.selectByIndex(i);
		    
		    Thread.sleep(3000);
		    //to deselect the options
		   // s.deselectAll();
		    //s.deselectByIndex(2);
		    //s.deselectByValue("grape");
		    //s.deselectByVisibleText("Apple");
		    WebElement firstselectedoption=s.getFirstSelectedOption();
		String text = firstselectedoption.getText();
		System.out.println(text);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int size2=allSelectedOptions.size();
		for(int i=0;i<size2;i++) {
		WebElement webElement=	allSelectedOptions.get(i);
		String text2 = webElement.getText();
		System.out.println(text2);
		}
		
		
		
		
		
		
		    
		    
		    
		    
		    
		  
		   
		    
		    
	
	
	
		
		
		}
		}	


