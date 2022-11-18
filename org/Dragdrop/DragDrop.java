package org.Dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Actions acc=new Actions(driver);
	WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement target=driver.findElement(By.id("bank"));
	acc.dragAndDrop(source, target).perform();
	
	
	
	
	
	
		
		
				
		
		
		
		
	}

}
