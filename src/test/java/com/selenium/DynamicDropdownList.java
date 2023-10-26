package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownList {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.id("fromCity")).sendKeys("delhi");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for (WebElement opt : list) {
			System.out.println(opt.getText());

			if (opt.getText().contains("Indira Gandhi International Airport")) {
				opt.click();

			}
		}
	}
}