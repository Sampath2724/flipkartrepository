package com.flipkart.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flipkart.pages.AddToCartPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.PlaceOrderPage;

public class PlaceOrderTest extends BaseTest{
	@BeforeClass
	public void openCart() throws InterruptedException
	{
		this.driver=this.getDriver();
		driver.get("https://www.flipkart.com/?ef_id=b41f28d0755b12162c3a4aedfded1176:G:s&s_kwcid=AL!739!10!76347474199614!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
		login=new LoginPage(driver);
		login.setEmail("8297108555");
		login.setPassword("14111984");
		login.clickOnLogin();
		AddToCartPage cart=new AddToCartPage(driver);
		cart.searchForProduct("iphone");
		cart.clickOnSearchButton();
		cart.productSelect();
		moveToNewTab();
		cart.clickOnAddTOCartButton();
		
	}
	@Test
    public void clickForPayment() throws InterruptedException
    {
    	PlaceOrderPage order=new PlaceOrderPage(driver);
    	order.clickOnOrderPlace();
    	order.clickOnDeliverHere();
    	order.clickOnContinue();
    	order.clickOnAgree();
    	
    }
	@AfterClass
	public void quiteDriver()
	{
		driver.quit();
	}
}
