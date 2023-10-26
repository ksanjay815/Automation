package com.empireHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='menu_Flights']//ancestor::body//descendant::a[text()='Search']")).click();
//	driver.findElement(By.xpath("//li[@class='menu_Flights']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//p[text()='Pune Flights']//ancestor::div//li[@class='menu_Cabs']")).click();
}
}
