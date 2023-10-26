package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElements {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		// Syntax for disabled elements
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"input[placeholder='First Enter name']\").disabled=false");
// for xpath do not write // in line 17 and do not write @ before attribute name
		driver.findElement(By.xpath("//input[@placeholder='First Enter name']")).sendKeys("sanjay kumar");

//Syntax for disabled elements
		js.executeScript("document.querySelector(\"input[placeholder='Enter Last name']\").disabled=false");
//for xpath do not write // in line 23 and do not write @ before attribute name
		driver.findElement(By.xpath("//input[@placeholder='Enter Last name']")).sendKeys("Prasad");

	}
}
