package com.HA.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmyap\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		
		String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    
		driver.findElement(By.xpath("//a[@id=\"welcome\"]")).click();
		//driver.findElement(By.partialLinkText("Logout")).click();

		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/a")).click();
	}

}
