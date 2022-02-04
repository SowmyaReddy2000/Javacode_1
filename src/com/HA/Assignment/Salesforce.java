package com.HA.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmyap\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		
		Select jobT = new Select(driver.findElement(By.name("UserTitle")));
		jobT.selectByVisibleText("IT Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("HA");
		
		Select Emp = new Select(driver.findElement(By.name("CompanyEmployees")));
		Emp.selectByVisibleText("101 - 500 employees");
		
		
		//driver.findElement(By.name("UserPhone")).sendKeys("9854706320");
		
		Select country = new Select(driver.findElement(By.name("CompanyCountry")));
		country.selectByVisibleText("United Kingdom");
		
//		driver.findElement(By.xpath("//div[@class=\"checkbox-ui\"]")).click();
		
		driver.findElement(By.name("start my free trial")).click();
		
		String errormsg = driver.switchTo().alert().getText();
		System.out.println(errormsg);
	}

}



/*Task 11 - Selenium Concepts 
1. Navigate onto https://www.salesforce.com/in/form/signup/freetrial-sales/
2. Enter first name as “John”
3. Enter last name as “wick”
4. Enter work email as “john@gmail.com”
5. Select Job title as “IT Manager”
6. Select Employees as “101-500 employees”
7. Select country as “United Kingdom”
8. Do not fill the phone number
9. Click on check box 
10. Click on start my free trial 
11. Get the error message displayed “Enter a valid phone number”
*/