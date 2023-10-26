package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.id("src")).sendKeys("New Delhi",Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("Secunderabad",Keys.ENTER);
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-14em0t0-1 xaHaF'][normalize-space()='17']")).click();
		driver.findElement(By.xpath("//div[text()='SEARCH']")).click();
		
		
	//	List<WebElement> city = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));

// //ul[@class='sc-dnqmqq eFEVtU']//text
// //div[@class='autoFill autosuggest-ul rdc-src']//li
		Thread.sleep(2000);
//
//		for (WebElement option : city) {
//			System.out.println(option.getText());
//			if (option.getText().contains("Secunderabad")) {
//				option.click();
//			}

//List<WebElement> Country = driver.findElements(By.xpath("//div[@class='mainelm']//li")); 
//for (int i = 0; i < Country.size(); i++) {
//System.out.println(Country.get(i).getText()); 
//if (Country.get(i).getText().equals("Secunderabad")) { 
//	  Country.get(i).click(); }
		}
	}
