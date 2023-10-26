package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions(); // to block browser popups
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options); // pass the object reference to block
		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//span[text()='Help']")).click();
		Set<String> id = driver.getWindowHandles();
		for (String ids : id) {
			String title = driver.switchTo().window(ids).getTitle();

			// if(title.equals("red:Care")) {
//			driver.close();
//		}

			if (title.equals("Online Bus Ticket Booking at Low Price and Best Offers - redBus")) {
				driver.close();
			}
		}
		driver.quit();
	}
}
