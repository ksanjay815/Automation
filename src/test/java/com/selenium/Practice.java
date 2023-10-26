package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("narendra");
		Thread.sleep(2000);
		List<WebElement> listItem = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		
//		for(int i=0; i<listItem.size();i++) {
//			System.out.println(listItem.get(i).getText());
//			
//			if(listItem.get(i).getText().contains("Narendra Modi Stadium")) {
//				listItem.get(i).click();
//			}
//		}
		
		for(WebElement option: listItem) { 
			System.out.println( option.getText());
		
		  if(option.getText().contains("Narendra Modi Stadium")) 
		  {
			  option.click(); }
		}
}}
