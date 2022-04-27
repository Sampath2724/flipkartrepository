package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage extends BasePage {
@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
WebElement btnOrderPlace;

@FindBy(xpath="//button[@class='_2KpZ6l RLM7ES _3AWRsL']")
WebElement btnDeliverHere;

@FindBy(xpath="//button[@class='_2KpZ6l _1seccl _3AWRsL']")
WebElement btnContinue;

@FindBy(xpath="//button[@class='_2KpZ6l _1uR9yB _3dESVI']")
WebElement btnAgree;

	public PlaceOrderPage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}
public void clickOnOrderPlace()
{
	explicitWait(btnOrderPlace);
	btnOrderPlace.click();
}
public void clickOnDeliverHere()
{
	explicitWait(btnDeliverHere);
	btnDeliverHere.click();
}
public void clickOnContinue()
{
	scrollByPage(2500);
	explicitWait(btnContinue);
	btnContinue.click();
}
public void clickOnAgree()
{
	explicitWait(btnAgree);
	btnAgree.click();
}


	
}
