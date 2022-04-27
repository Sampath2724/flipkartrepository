package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BasePage {

	@FindBy(xpath="//div[@class='exehdJ']")
	WebElement btnMyProfile;
	
	@FindBy(xpath="(//a[@class='_2kxeIr'])[10]")
	WebElement btnLogout;
	
	
	public LogoutPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void mouseOverToMyprofile() throws InterruptedException
	{
		//explicitWaitForSelected(btnMyProfile);
		Thread.sleep(4000);
		super.mouseMoveToWebElement(btnMyProfile);
	}
	public void clickOnLogout() throws InterruptedException
	{
		//explicitWaitForSelected(btnLogout);
		Thread.sleep(2000);
		btnLogout.click();
	}
}
