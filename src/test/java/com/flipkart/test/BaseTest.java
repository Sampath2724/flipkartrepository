package com.flipkart.test;

import java.util.ArrayList;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
WebDriver driver=null;
LoginPage login=null;
DevTools chromeDevTools;

public WebDriver getDriver()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	chromeDevTools=((ChromeDriver) driver).getDevTools();
	return driver;
}
public void moveToNewTab()
{
	ArrayList<String> scr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(scr.get(1));
	
}
public  void emulateNetworkConditionTest() {
	  System.out.println("----in    offf internet ");
	  
	  chromeDevTools.createSession();
	  //chromeDevTools.send(Network.enable(Optional.of(1000000), Optional.of(0), Optional.of(0)));
  chromeDevTools.send(
       Network.emulateNetworkConditions(true,0,0,0,Optional.of(ConnectionType.CELLULAR3G)));
	/*
	 * long startTime = System.currentTimeMillis();
	 * driver.navigate().to("https://www.swtestacademy.com"); long endTime =
	 * System.currentTimeMillis();
	 */ 
  System.out.println("end offf internet ");
}
public  void emulateNetworkConditionSlowTest() {
	  System.out.println("----in    Slow down internet ");
	  
	  chromeDevTools.createSession();
	  //chromeDevTools.send(Network.enable(Optional.of(1000000), Optional.of(0), Optional.of(0)));
chromeDevTools.send(
     Network.emulateNetworkConditions(false,150,25000,20000,Optional.of(ConnectionType.CELLULAR3G)));
	/*
	 * long startTime = System.currentTimeMillis();
	 * driver.navigate().to("https://www.swtestacademy.com"); long endTime =
	 * System.currentTimeMillis();
	 */ 
System.out.println("End slowdown internet ");
}
public  void emulateNetworkConditionFastTest() {
	  System.out.println("----in    Fast internet ");
	  
	  chromeDevTools.createSession();
	  //chromeDevTools.send(Network.enable(Optional.of(1000000), Optional.of(0), Optional.of(0)));
chromeDevTools.send(
   Network.emulateNetworkConditions(false,0,2500000,2000000,Optional.of(ConnectionType.CELLULAR3G)));
	/*
	 * long startTime = System.currentTimeMillis();
	 * driver.navigate().to("https://www.swtestacademy.com"); long endTime =
	 * System.currentTimeMillis();
	 */ 
System.out.println("End Fast internet ");
}


}
