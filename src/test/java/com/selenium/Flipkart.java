package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		// webdriver is interface driver is variable name = new ChromeDriver(); is
		// object
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
	// multiple attribute value by using "and" and "or"
	// tagname[@attributename='attribute value' and @attributename='attribute value']
	// tagname[@attributename='attribute value'] [@attributename='attribute value']
	// tagname[@attributename='attribute value' or @attributename='attribute value']
	// tagname[text()='attribute value']
	
	driver.findElement(By.name("q")).sendKeys("hp laptop",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@title='Flipkart']")).click();
	driver.findElement(By.xpath("//div[@class='YBLJE4']/following::div[@aria-label='Fashion']")).click();
	
	driver.close();
	}

}
