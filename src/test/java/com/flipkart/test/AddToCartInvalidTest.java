package com.flipkart.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.pages.AddToCartPage;
import com.flipkart.pages.LoginPage;

public class AddToCartInvalidTest extends BaseTest {
	@BeforeMethod
public void initMethod() {
	driver=getDriver();
	driver.get("https://www.flipkart.com/?ef_id=b41f28d0755b12162c3a4aedfded1176:G:s&s_kwcid=AL!739!10!76347474199614!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
	login=new LoginPage(driver);
	login.setEmail("8297108555");
	login.setPassword("14111984");
	login.clickOnLogin();
	

}
@Test(priority=1)
public void searchProductWithoutSearchData() throws InterruptedException
{
	AddToCartPage cart=new AddToCartPage(driver);
	cart.clickOnSearchButton();
}
@Test(priority=2)
public void searchProductWithOnlySpecialCharInSearchData() throws InterruptedException
{
	AddToCartPage cart=new AddToCartPage(driver);
	cart.searchForProduct("%$%$^$^$^$^$^$^$^");
	cart.clickOnSearchButton();
}
@Test(priority=3)
public void searchProductWithOnlyNUmbersInSearchData() throws InterruptedException
{
	AddToCartPage cart=new AddToCartPage(driver);
	cart.searchForProduct("49495464964949966469");
	cart.clickOnSearchButton();
}
@AfterMethod
public void quiteDriver()
{
	driver.quit();
}

	
}
