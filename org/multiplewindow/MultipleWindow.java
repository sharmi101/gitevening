package org.multiplewindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone" + Keys.ENTER);
		WebElement lnkiphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 128GB Starlight']"));
		lnkiphone.click();
		String parentwindowId = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();
		List<String> li = new ArrayList();
		li.addAll(allwindowId);
		String ChildwindowId = li.get(1);
		driver.switchTo().window(ChildwindowId);
		WebElement btncart = driver.findElement(By.id("add-to-cart-button"));
		btncart.click();
		driver.switchTo().window(parentwindowId);
		WebElement lnkiphone2 = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - (Product) RED']"));
		lnkiphone2.click();
		Set<String> allwindowIds = driver.getWindowHandles();
		List<String> li1 = new ArrayList();
		li1.addAll(allwindowIds);
		String newwindowId = li1.get(2);
		driver.switchTo().window(newwindowId);
		WebElement btncart1 = driver.findElement(By.id("add-to-cart-button"));
		btncart1.click();

	}

}
