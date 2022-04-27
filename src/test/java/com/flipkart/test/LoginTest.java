package com.flipkart.test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.pages.LoginPage;

public class LoginTest extends BaseTest{
@BeforeMethod	
public void initMethod()
{
	this.driver=this.getDriver();
	driver.get("https://www.flipkart.com/?ef_id=b41f28d0755b12162c3a4aedfded1176:G:s&s_kwcid=AL!739!10!76347474199614!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
	login=new LoginPage(driver);
}
@Parameters({"username1","password1"})
@Test(priority=1)
public void loginToFlipkart(String username1,String password1)
{
	login.setEmail(username1);
	login.setPassword(password1);
	login.clickOnLogin();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	String actualTitle = driver.getTitle();
	String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	Assert.assertEquals(actualTitle, expectedTitle);
}
@AfterMethod
public void quitDriver()
{
	driver.quit();
}

}
