package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleList {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		driver.findElement(By.name("q")).sendKeys("hp laptop");

		List<WebElement> lis = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

		for (WebElement opt : lis) {
			System.out.println(opt.getText());

			if (opt.getText().equals("hp laptop i5")) {
				opt.click();
				driver.quit();
			}
		}

	}

}
