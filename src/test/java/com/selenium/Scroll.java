package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1500)");
		// this code is to scroll till the bottom of page
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		// Scrolling to a particular WebElement by using getLocation() method
		WebElement apsrtc = driver.findElement(By.xpath("//img[@alt='APSRTC_logo']"));
		Point loc = apsrtc.getLocation();
		js.executeScript("window.scrollBy"+ loc);
	}
}