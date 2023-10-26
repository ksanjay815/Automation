package com.selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		/*
		 * System.out.println(driver.getCurrentUrl());
		 * driver.manage().window().maximize();
		 * System.out.println(driver.getPageSource());
		 * System.out.println(driver.getTitle());
		 */
		/*
		 * //To change the size of the browser window Dimension d=new
		 * Dimension(600,200); driver.manage().window().setSize(d); Thread.sleep(3000);
		 * 
		 * //To change the position of the browser window Point p=new Point(900,800);
		 * driver.manage().window().setPosition(p);
		 * 
		 * //To delete all the cookies stored by the browser window
		 * driver.manage().deleteAllCookies();
		 */
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		 
		 
		 
		 
		 driver.close();
	}
}
