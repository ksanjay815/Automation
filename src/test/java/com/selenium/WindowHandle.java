package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions(); // to block browser popups
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options); // pass the object reference to block
		driver.get("https://www.redbus.in/");
//		String mainWindow =driver.getWindowHandle();
//		System.out.println(mainWindow);
//		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//span[text()='Help']")).click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> ids = id.iterator();
		String mainWindow = ids.next();
		System.out.println(mainWindow);
//		System.out.println(driver.getTitle());
		String childWindow = ids.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
	}
}
