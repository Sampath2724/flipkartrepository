package com.flipkart.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		//PopulateElementJs(driver, txtBoxSearch, "😄");
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
		imgProduct.clic();
	}

	public void clickOnAddTOCartButton() throws InterruptedException {
		explicitWait(btnAddToCart);
		btnAddToCart.click();
	}
	 public static void PopulateElementJs(WebDriver driver, WebElement element, String text)
	    {
	        String script = "arguments[0].value=' " + text + "iphone ';";
	        ((JavascriptExecutor)driver).executeScript(script, element);
	        element.sendKeys(Keys.ENTER);
	        }

}
