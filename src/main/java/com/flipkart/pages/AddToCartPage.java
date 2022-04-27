package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BasePage {

	@FindBy(xpath = "//input[@class='_3704LK']")
	WebElement txtBoxSearch;

	@FindBy(xpath = "//button[@class='L0Z3Pu']")
	WebElement btnSearch;

	@FindBy(xpath = "(//img[@class='_396cs4 _3exPp9'])[1]")
	WebElement imgProduct;

	@FindBy(xpath = "//button[@class = \"_2KpZ6l _2U9uOA _3v1-ww\"]")
	WebElement btnAddToCart;

	public AddToCartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void searchForProduct(String productname) throws InterruptedException {
		Thread.sleep(3000);
		//explicitWait(txtBoxSearch);
		txtBoxSearch.click();
		txtBoxSearch.clear();
		txtBoxSearch.sendKeys(productname);
	}

	public void clickOnSearchButton() throws InterruptedException {
		Thread.sleep(2000);
		//explicitWait(btnSearch);
		btnSearch.click();
	}

	public void productSelect() throws InterruptedException {
		//explicitWait(imgProduct);
		Thread.sleep(3000);
		imgProduct.click();
	}

	public void clickOnAddTOCartButton() throws InterruptedException {
		explicitWait(btnAddToCart);
		btnAddToCart.click();
	}
}
