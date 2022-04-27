package com.flipkart.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.pages.LoginPage;
import com.flipkart.pages.LogoutPage;

public class LogoutTest extends BaseTest{
	@BeforeMethod
	public void initMethod() throws InterruptedException
	{
		driver=getDriver();
		driver.get("https://www.flipkart.com/?ef_id=b41f28d0755b12162c3a4aedfded1176:G:s&s_kwcid=AL!739!10!76347474199614!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
		login=new LoginPage(driver);
		login.setEmail("8297108555");
		login.setPassword("14111984");
		login.clickOnLogin();
	}
	@Test
public void clickOnLogoutButton() throws InterruptedException
{
	LogoutPage logout=new LogoutPage(driver);
	logout.mouseOverToMyprofile();
	logout.clickOnLogout();
}
@AfterMethod
public void quiteDriver()
{
	driver.quit();
}
}
