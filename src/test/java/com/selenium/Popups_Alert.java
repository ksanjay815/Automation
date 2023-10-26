package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups_Alert {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		System.out.println(al.getText());
		al.dismiss();

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		System.out.println(al.getText());
		al.sendKeys("sanjay kumar");
		al.accept();
	}
}
