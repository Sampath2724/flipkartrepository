package com.flipkart.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
WebDriver driver=null;
LoginPage login=null;
public WebDriver getDriver()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
}
public void moveToNewTab()
{
	ArrayList<String> scr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(scr.get(1));
	
}
}
