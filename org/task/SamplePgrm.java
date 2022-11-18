package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SamplePgrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btncreatenewAcc = driver.findElement(By.xpath("//a[@rel='async']"));
		btncreatenewAcc.click();
		Thread.sleep(3000);
		WebElement ddnmonth = driver.findElement(By.id("month"));
		Select s = new Select(ddnmonth);
		// s.selectByIndex(4);
		// s.selectByValue("5");
		s.selectByVisibleText("May");
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			WebElement WebElement = options.get(i);
			String text = WebElement.getText();
			System.out.println(text);

		}

	}
}
