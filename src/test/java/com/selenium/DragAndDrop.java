package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		driver.switchTo().frame(2);

		WebElement Drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));

		WebElement Drop = driver.findElement(By.id("trash"));

		Actions act = new Actions(driver);
		act.dragAndDrop(Drag, Drop).perform();

		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();

	}
}