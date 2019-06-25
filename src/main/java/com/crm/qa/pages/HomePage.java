package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'PARIMALA H C')]")
	@CacheLookup
	WebElement userNameLabel;
	
    @FindBy(xpath="//*[@id=\"main-nav\"]/a[3]/span")
	WebElement contactsLink;	
    
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//button[@class = 'ui linkedin button']/i[@class='edit icon']")
	WebElement newContactLink;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() throws InterruptedException  {
		contactsLink.click();
		Thread.sleep(3000);
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksPage() {
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContact() {
		newContactLink.click();
	}
	

}
