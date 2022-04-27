package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement txtBoxEmail;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement txtBoxpassword;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//span[@class='_2YULOR']")
	public WebElement txtInvalidValidation;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String email)
	{
		explicitWait(txtBoxEmail);
		txtBoxEmail.click();
		txtBoxEmail.clear();
		txtBoxEmail.sendKeys(email);
	}
	public void setPassword(String password)
	{
		explicitWait(txtBoxpassword);
		txtBoxpassword.click();
		txtBoxpassword.clear();
		txtBoxpassword.sendKeys(password);
	}
	public void clickOnLogin()
	{
		explicitWait(btnLogin);
		btnLogin.click();
	}
	public String invalidMessageUserPassword()
	{
		explicitWait(txtInvalidValidation);
		return txtInvalidValidation.getText();
	}
}

