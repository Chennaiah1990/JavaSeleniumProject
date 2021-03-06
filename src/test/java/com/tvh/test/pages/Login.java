package com.tvh.test.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tvh.test.locators.MainPageLinks;
import com.tvh.test.locators.UsersUrl;
import com.tvh.test.pages.SeleniumWebdriver.Locators;

public class Login  {
	
public static Login loginAsAdmin(WebDriver webDriver) throws Exception{
		
		webDriver.navigate().to(UsersUrl.WFM_LAST_RELEASE_ADMIN_URL);
		webDriver.manage().deleteAllCookies();
		webDriver.manage().window().maximize();
		 SeleniumWebdriver.wait(4);
	    for (String link : MainPageLinks.linksMap.keySet()){
	    	assertEquals(link, webDriver.findElement(By.xpath(MainPageLinks.linksMap.get(link))));
	    }
	    
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	

public static Login loginAsWorker(WebDriver webDriver)throws Exception{
	webDriver.navigate().to(UsersUrl.WFM_DEV_WORKER_USER);
	webDriver.manage().deleteAllCookies();
	webDriver.manage().window().maximize();
	 SeleniumWebdriver.wait(4);
	 SeleniumWebdriver.click(Locators.xpath, MainPageLinks.WorKShopManagementxpath, webDriver);
	 SeleniumWebdriver.wait(6);
	return null;
}



public  static OperationTypePageMap loginAsRSP(WebDriver webDriver){
	
	webDriver.navigate().to(UsersUrl.WFM_RSP_URL);

    for (String link : MainPageLinks.linksMap.keySet()){
    	assertEquals(link, webDriver.findElement(By.xpath(MainPageLinks.linksMap.get(link))));
    }
    
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	return null;
}
}
