package com.HA.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gotomeeting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmyap\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goto.com/meeting/");
		
		driver.findElement(By.xpath("//button[@id=\"truste-consent-button\"]")).click();
		driver.findElement(By.linkText("Try Free")).click();
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("wick");
		driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");
		//driver.findElement(By.id("")).sendKeys("Help Desk");
		

		
	}

}


/*    1. Navigate onto  https://www.goto.com/meeting/
2. Click on Accept Recommended Settings
3. Click on Try Free
4. Enter first name as “John”
5. Enter last name as “wick”
6. Enter work email as “john@gmail.com”
7. Job Title as “Help Desk”
8. Company size – 10-99
9. Click on signup
*/