package org.confirm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement confirm=driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm.click();
		WebElement btnconfirm=driver.findElement(By.xpath("//button[contains(text(),'confirm')]"));
		btnconfirm.click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		al.accept();
		
		
		
	}

}
