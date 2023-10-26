package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotKeys_UploadFile {
	public static void main(String[] args) throws InterruptedException, AWTException {

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

		driver.findElement(By.xpath("//a[text()='Add Inventory']")).click();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement date=driver.findElement(By.name("RecievedDate"));
		date.sendKeys("01/01/1992");
		
		WebElement img = driver.findElement(By.name("ProductMainImageUploaded"));
		// JavascriptExecutor js = (JavascriptExecutor) driver;

		// to upload file using sendkeys
		// js.executeScript("window.scrollBy(0,1500)");
		// img.sendKeys("C:\\Users\\Admin\\Downloads\\mango.jpeg");

		// to upload file using RobotKeys

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", img);
		Robot rb = new Robot();
		rb.delay(2000);

		// this next 2 lines is to copy the file
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\mango");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// this next 2 lines is to paste the file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER); // enter
		rb.keyRelease(KeyEvent.VK_ENTER);

	}
}
