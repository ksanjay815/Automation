package com.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\redbus.png");
		Files.copy(src, Dest);

		// to take the particular element screenshot
		WebElement India = driver.findElement(By.xpath("//img[@alt='India']"));
		File from = India.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\redbusIndia.png");
		Files.copy(from, to);

	}
}