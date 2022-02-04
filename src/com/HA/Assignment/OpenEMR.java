package com.HA.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenEMR {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmyap\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.openemr.io/b/openemr");
				
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select lang = new Select(driver.findElement(By.name("languageChoice")));
		lang.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();		

		driver.findElement(By.xpath("//div[text()='Messages']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='msg']")));
		
		driver.findElement(By.xpath("//a[text()='Add New']")).click();
		
		driver.findElement(By.id("note")).sendKeys("hello");
		
		Select type = new Select(driver.findElement(By.id("form_note_type")));
		type.selectByVisibleText("Pharmacy");
		
		Select status = new Select(driver.findElement(By.id("form_message_status")));
		status.selectByVisibleText("New");
		
		Select user = new Select(driver.findElement(By.id("users")));
		user.selectByVisibleText("Jarvis, Fred");
		
		driver.findElement(By.id("newnote")).click();
		
		//String errormsg=driver.switchTo();
		//System.out.println(errormsg);

		driver.switchTo().defaultContent();
		
	}

}


/*Task 12 - Selenium Concepts (check site after 3:30 PM IST)
1. Navigate onto http://demo.openemr.io/b/openemr/
2. Update username as admin
3. Update password as pass
4. Select Language as “English (Indian)”
5. Click on the login button
6. Click on Messages
7. Click on Add New
8. Enter text in text area as “hello”
9. Select Type as Pharmacy
10. Select Status as New
11. Select 1st user shown
12. Click on Send message
13. Print the error message - Please choose a patient
*/