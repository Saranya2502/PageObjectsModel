package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginObjects;
import pageObjects.UpdateDetailsObjects;

public class loginTestCases {

	@Test
	public void login() throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	 WebDriver   driver = new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
    	
		
		 PageFactory.initElements(driver,LoginObjects.class);
		 
		 
		LoginObjects.userName.sendKeys("Admin");

		LoginObjects.password.sendKeys("admin123");
		
		Thread.sleep(3000);
		
		LoginObjects.submit.click();



	}




}

