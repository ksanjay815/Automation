package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.xpath("//input[@placeholder='example@gmail.com']")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.id("pword")).sendKeys("ZPMHQHIA");
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='btn green_btn']"));
		LoginBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='pe-7s-keypad']")).click();
		driver.findElement(By.xpath("//span[text()='Inventory']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Inventory")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//table[@id='dataTableExample1']//tr[*]//td[*]//a[@href='/Inventory/ProductDetail?id=1816&pageNumber=1&pageSize=10&search=&CategoryId=0&SubCategoryId=0']"))
				.click();
		driver.quit();

	}

}
