package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	
	@FindBy(xpath="//div[text()='Contacts']")
	WebElement contactsLabel;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement email;
	
	@FindBy(xpath="//i[@class='save icon']")
	WebElement saveBtn;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsLabel() {
		return contactsLabel.isDisplayed();
	}

	public void selectContactsByName(String name) throws InterruptedException{
        WebElement element = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]//preceding-sibling::td//input[@type = 'checkbox']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);
	}
	
	public void createNewContact(String ftName, String ltName, String eml1) throws InterruptedException {
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		email.sendKeys(eml1);
		saveBtn.click();
		Thread.sleep(3000);
	}
}
