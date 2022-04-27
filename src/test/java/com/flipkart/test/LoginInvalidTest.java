package com.flipkart.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.pages.LoginPage;

public class LoginInvalidTest extends BaseTest{
	@BeforeMethod
	public void initMethod()
	{
		this.driver=this.getDriver();
		driver.get("https://www.flipkart.com/?ef_id=b41f28d0755b12162c3a4aedfded1176:G:s&s_kwcid=AL!739!10!76347474199614!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
		login=new LoginPage(driver);
	}
	@Parameters({"username1"})
	@Test(priority=1)
	public void loginToFlipkartOnlyEmail(String username1) throws InterruptedException
	{
		login.setEmail(username1);
		login.clickOnLogin();
		Assert.assertEquals(login.invalidMessageUserPassword(), "Please enter Password");
	}
	@Parameters({"password1"})
	@Test(priority=2)
	public void loginToFlipkartOnlyPassword(String password1) throws InterruptedException
	{
		login.setPassword(password1);
		login.clickOnLogin();
		Assert.assertEquals(login.invalidMessageUserPassword(), "Please enter valid Email ID/Mobile number");
	}
	@Parameters({"username2","password2"})
	@Test(priority=3)
	public void loginToFlipkartWithInvalidEmailPassword(String username2,String password2) throws InterruptedException
	{
		login.setEmail(username2);
		login.setPassword(password2);
		login.clickOnLogin();
		Assert.assertEquals(login.invalidMessageUserPassword(), "Please enter valid Email ID/Mobile number");
	}
	@AfterMethod
	public void quitDriver()
	{
		driver.quit();
	}


}
