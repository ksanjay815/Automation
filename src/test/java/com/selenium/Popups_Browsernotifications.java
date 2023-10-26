package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups_Browsernotifications {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();  // to block browser popups
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);    // pass the object reference to block 
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
	}
}
