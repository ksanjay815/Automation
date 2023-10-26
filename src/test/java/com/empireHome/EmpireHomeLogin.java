package com.empireHome;

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

public class EmpireHomeLogin {
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
		Thread.sleep(2000);
		driver.findElement(By.id("select2-catDD-container")).click();
		driver.findElement(By.xpath("//ul[@id='select2-catDD-results'] //descendant ::li[text()='Study hall']"))
				.click();

		driver.findElement(By.id("select2-subcatDD-container")).click();
		driver.findElement(By.xpath("//ul[@id='select2-subcatDD-results'] //descendant ::li[text()='chair']")).click();

		driver.findElement(By.name("ModelNumber")).sendKeys("MT-01447");
		driver.findElement(By.name("Title")).sendKeys("Study Chair");
		driver.findElement(By.name("ItemDescription")).sendKeys("Study Chair for students below 10 years");
		driver.findElement(By.name("Brand")).sendKeys("Savya");
		driver.findElement(By.name("Height")).sendKeys("3");
		driver.findElement(By.name("Width")).sendKeys("1");
		driver.findElement(By.name("Breadth")).sendKeys("1");

		driver.findElement(By.name("ColorName")).sendKeys("Black");
		driver.findElement(By.name("ColorImageUploaded")).sendKeys("C:\\Users\\Admin\\Downloads\\blue.jpg");
		driver.findElement(By.id("select2-InventoryStatusId-container")).click();
		driver.findElement(By.xpath("//ul[@id='select2-InventoryStatusId-results'] //descendant ::li[text()='Sold']"))
				.click();
		driver.findElement(By.id("select2-InventoryConditonId-container")).click();
		driver.findElement(By.xpath("//ul[@id='select2-InventoryConditonId-results'] //descendant ::li[text()='Good']"))
				.click();
		driver.findElement(By.id("select2-InventoryLocationId-container")).click();
		driver.findElement(
				By.xpath("//ul[@id='select2-InventoryLocationId-results'] //descendant ::li[text()='Hyderbad']"))
				.click();
		driver.findElement(By.id("RecievedDate")).sendKeys("25-09-2023");
		driver.findElement(By.name("ActualPrice")).sendKeys("1200");
		driver.findElement(By.xpath("//span[@role='combobox'][@aria-labelledby='select2-factor-container']")).click();
		driver.findElement(By.xpath("//ul[@id='select2-factor-results'] //descendant ::li[text()='3.00']")).click();
		driver.findElement(By.name("HSNCode")).sendKeys("MT01");
		driver.findElement(By.name("InvoiceNumber")).sendKeys("MT01447");
		driver.findElement(By.name("RackName")).sendKeys("Rack-203");
		driver.findElement(By.name("PODetails")).sendKeys("Sanjay Enterprises");

		driver.findElement(By.name("Qty")).sendKeys("5");

		WebElement img = driver.findElement(By.name("ProductMainImageUploaded"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// to upload file using sendkeys
		js.executeScript("window.scrollBy(0,1500)");
		img.sendKeys("C:\\Users\\Admin\\Downloads\\chair.jpg");

		WebElement img1 = driver.findElement(By.name("ProductOtherImagesUploaded"));
		// img1.sendKeys("C:\\Users\\Admin\\Downloads\\chair.jpg");

		// to upload file using RobotKeys
		js.executeScript("arguments[0].click();", img1);
		Robot rb = new Robot();
		rb.delay(2000);

		// this next 2 lines is to copy the file
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\chair");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// this next 2 lines is to paste the file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER); // enter
		rb.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
driver.close();
	}
}
