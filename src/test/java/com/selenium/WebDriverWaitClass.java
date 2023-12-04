package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitClass {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.switchTo().frame(2);
		Thread.sleep(2000);

		WebElement Drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Drag));

		// or by writing xpath
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='The peaks of High Tatras']")));

	}

}
