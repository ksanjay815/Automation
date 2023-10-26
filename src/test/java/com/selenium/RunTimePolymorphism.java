package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		WebDriver driver = null;

		Scanner sc = new Scanner(System.in);
		System.err.println("enter browser name"); // .err to print in red colour
		String browsername = sc.next();
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new SafariDriver();
		} else {
			System.out.println("enter the browser name correctly");
		}

		driver.get("https://www.facebook.com/");
	}
}
