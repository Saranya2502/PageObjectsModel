package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginObjects;
import pageObjects.UpdateDetailsObjects;

public class UpdateDetailsTestcase {

	@Test
	public void updatedetails() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver   driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		 PageFactory.initElements(driver,LoginObjects.class); 
		 
		LoginObjects.userName.sendKeys("Admin");
		LoginObjects.password.sendKeys("admin123");
		
		Thread.sleep(3000);
		LoginObjects.submit.click();
		
		PageFactory.initElements(driver,UpdateDetailsObjects.class);
		
		
		UpdateDetailsObjects.myInfo.click();
		UpdateDetailsObjects.edit.click();
		UpdateDetailsObjects.employeeId.clear();
		UpdateDetailsObjects.employeeId.sendKeys("1077");
		UpdateDetailsObjects.nickName.clear();
		UpdateDetailsObjects.nickName.sendKeys("Jerry");
		UpdateDetailsObjects.save.click();
		
		
		
		
	}
	
	
	
	
	
	
}
