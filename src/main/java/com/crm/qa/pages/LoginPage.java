package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class = 'ui fluid large blue submit button']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?']")
	WebElement FrgtPass;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up']")
	WebElement SignUpBtn;
	
	
	//Initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
     
	public HomePage login(String eml,String pwd) {
		email.sendKeys(eml);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		return new HomePage();
		
	}
	
	
}
