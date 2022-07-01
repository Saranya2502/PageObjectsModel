package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateDetailsObjects {

	@FindBy(id="menu_pim_viewMyDetails")
	public static WebElement myInfo;
	
	@FindBy(id="btnSave")
	public static WebElement edit;
	
	@FindBy(id="personal_txtEmployeeId")
	public static WebElement employeeId;
	
	@FindBy(id="personal_txtEmpNickName")
	public static WebElement  nickName;
	
	@FindBy(id="btnSave")
	public static WebElement save;
	
	
	
	
	
	
	
}

