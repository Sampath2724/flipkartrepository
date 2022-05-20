package com.flipkart.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.pages.AddToCartPage;
import com.flipkart.pages.LoginPage;

public class AddToCartTest extends BaseTest{
	
	@BeforeMethod
	public void loginFlipkart()	{
		this.driver=this.getDriver();
		driver.get("https://www.flipkart.com/?ef_id=b41f28d0755b12162c3a4aedfded1176:G:s&s_kwcid=AL!739!10!76347474199614!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
		login=new LoginPage(driver);
		login.setEmail("8297108555");
		login.setPassword("14111984");
		login.clickOnLogin();
		try {
			/*
			 * this.emulateNetworkConditionTest(); Thread.sleep(10000);
			 * this.emulateNetworkConditionSlowTest(); driver.navigate().refresh();
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority=1)
	public void addProductToCart() throws InterruptedException
	{
		AddToCartPage cart=new AddToCartPage(driver);
		cart.searchForProduct("iphone");
		this.emulateNetworkConditionFastTest();
		cart.clickOnSearchButton();
		cart.productSelect();
		moveToNewTab();
		cart.clickOnAddTOCartButton();
	}
	
	@AfterMethod
	public void quiteDriver()
	{
		driver.quit();
	}
}
