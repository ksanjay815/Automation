package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropdown {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/en/book-a-free-demo/");

		// Approach 1 to select dropdown

		// it is created by <select> tag and <options> tag therefore we are using Select
		/*
		 * // Class. WebElement Country = driver.findElement(By.name("Country"));
		 * 
		 * Select sel = new Select(Country); sel.selectByVisibleText("Hungary");
		 * Thread.sleep(2000); sel.selectByVisibleText("Mali"); driver.close();
		 */

		// Approach 2 to select dropdown by using findelements() method and forloop
		
		  List<WebElement> Country = driver.findElements(By.xpath("//select[@name='Country']//option")); 
		  for (int i = 0; i < Country.size(); i++) {
		  System.out.println(Country.get(i).getText()); 
		  if (Country.get(i).getText().equals("Australia")) { 
			  Country.get(i).click(); }
	
		 
			// Approach 3 to select dropdown by using findelements() method and for eachloop
		  
			/*List<WebElement> Country = driver.findElements(By.xpath("//select[@name='Country']//option"));
			for (WebElement options:Country) {
				
				if (options.getText().equals("Australia")) {
					options.click();*/
				
		// Approach 4 to select dropdown by using findelements() method 
		/*
		 * List<WebElement> Country =
		 * driver.findElements(By.xpath("//select[@name='Country']//option"));
		 * Country.get(Country.size()-230).click();
		 */
		  }
				
		}
	
}
