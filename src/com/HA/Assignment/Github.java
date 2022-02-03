package com.HA.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmyap\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_field")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name=\"commit\"]")).click();
		

	}

}

/*2. Click on Sign in
3. Enter Username as Admin
4. Enter Password as admin123
5. Click on Login */