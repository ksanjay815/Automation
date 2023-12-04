package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDemo {

	public static void main(String[] args) throws InterruptedException {

		// webdriver is interface driver is variable name = new ChromeDriver(); is
		// object
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.id("email")).sendKeys("ksanjay815@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("ksanjay815");
		 * driver.findElement(By.name("login")).click();
		 */
		// driver.findElement(By.linkText("Forgotten password?")).click();
		// driver.findElement(By.partialLinkText("Forgotten password?")).click();

		// cssselector - two rules to apply
		// driver.findElement(By.cssSelector("#email")).sendKeys("ksanjay815");
		// driver.findElement(By.cssSelector("[name='pass']")).sendKeys("ksanjay815");

		// xpath
		// 1.) relative xpath

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ksanjay815");

		// multiple attribute value by using "and" and "or"
		// tagname[@attributename='attribute value' and @attributename='attribute
		// value']
		// tagname[@attributename='attribute value'] [@attributename='attribute value']
		// tagname[@attributename='attribute value' or @attributename='attribute value']
		// tagname[text()='attribute value']
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}

}
