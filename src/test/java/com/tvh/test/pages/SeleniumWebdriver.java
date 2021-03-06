package com.tvh.test.pages;

import static junit.framework.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWebdriver {
	
	public enum Locators		{ xpath, id, name, classname, paritallinktext, linktext, tagname };
	

	//a method for allowing selenium to pause for a set amount of time
	public static void wait( int seconds ) throws InterruptedException {
		Thread.sleep( seconds*1000 );
	}
	public static void wait( double seconds ) throws InterruptedException {
		Thread.sleep( Double.doubleToLongBits( seconds*1000 ) );
	}

	//a method for waiting until an element is displayed
	public static void waitForElementDisplayed( Locators locator, String element, WebDriver webDriver ) throws Exception {
		waitForElementDisplayed( getWebElement( locator, element, webDriver ), 5 );
	}
	public static void waitForElementDisplayed( Locators locator, String element, int seconds,WebDriver webDriver  ) throws Exception {
		waitForElementDisplayed( getWebElement( locator, element, webDriver ), seconds );
	}
	public static void waitForElementDisplayed( WebElement element ) throws Exception {
		waitForElementDisplayed( element, 5 );
	}
	public static void waitForElementDisplayed( WebElement element, int seconds ) throws Exception {
		//wait for up to XX seconds for our error message
		long end = System.currentTimeMillis() + ( seconds * 1000 );
		while (System.currentTimeMillis() < end) {
		
			if ( element.isDisplayed() ) {
				break;
			}
		}
	}

	
	//checking element functionality
	public static void checkElementDisplayed( Locators locator, String element ) throws Exception {
		checkElementDisplayed( getWebElement( locator, element, null ) );
	}
	 public static  void checkElementDisplayed( WebElement element ) throws Exception {
		assertTrue( element.isDisplayed() );
	}
	
	
	
	
	//selenium actions functionality
	

	//our generic selenium click functionality implemented
	public static void click( Locators locator, String element ,WebDriver webDriver) throws Exception {
		click( getWebElement( locator, element, webDriver ), webDriver );
	}
	public static void click( WebElement element ,WebDriver webDriver ) {
		Actions selAction = new Actions(webDriver);
		selAction.click( element ).perform();
	}
	
	
	public static void clear( Locators locator, String element ,WebDriver webDriver) throws Exception {
		click( getWebElement( locator, element, webDriver ), webDriver );
	}
	public static void clear( WebElement element ,WebDriver webDriver ) {
		Actions selAction = new Actions(webDriver);
		selAction.click( element ).perform();
	}
	
	
	
	
	

	//a method to submit
	public static void submit( Locators locator, String element ,WebDriver webDriver) throws Exception {
		click( getWebElement( locator, element, webDriver ), webDriver );
	}
	public static void submit( WebElement element ,WebDriver webDriver ) {
		Actions selAction = new Actions(webDriver);
		selAction.click( element ).perform();
	}
	
	
	
	//a method to simulate the mouse hovering over an element
	public static void hover( Locators locator, String element ,WebDriver webDriver ) throws Exception {
		hover( getWebElement( locator, element, webDriver ), webDriver );
	}
	public static void hover( WebElement element ,WebDriver webDriver) throws Exception {
		Actions selAction = new Actions(webDriver);
		selAction.moveToElement( element ).perform();
	}

	//our generic selenium type functionality
	public static void type( Locators locator, String element, String text,WebDriver webDriver ) throws Exception {
		type( getWebElement( locator, element, webDriver ), text, webDriver );
	}
	public static void type( WebElement element, String text ,WebDriver webDriver) {
		Actions selAction = new Actions(webDriver);
		element.clear();
		selAction.sendKeys( element, text ).perform();
	}

	
	
	
	//extra base selenium functionality
	

	//a method to grab the web element using selenium webwebDriver
	public static WebElement getWebElement( Locators locator, String element,WebDriver webDriver ) throws Exception {
		By byElement;
		switch ( locator ) {		//determine which locator item we are interested in
			case xpath:		{ byElement = By.xpath(element); 		break; }
			case id:		{ byElement = By.id(element); 			break; }
			case name:		{ byElement = By.name(element); 		break; }
			case classname:		{ byElement = By.className(element); 		break; }
			case linktext:		{ byElement = By.linkText(element); 		break; }
			case paritallinktext:	{ byElement = By.partialLinkText(element); 	break; }
			case tagname:		{ byElement = By.tagName(element); 		break; }
			default:		{ throw new Exception(); }
		}
		WebElement query = webDriver.findElement( byElement );	//grab our element based on the locator
		return query;	//return our query
	}

	//a method to obtain screenshots
	/*public static void takeScreenshot(String action) throws IOException {
		//make our screenshot name friendly
		action = action.replaceAll("[^a-zA-Z0-9]", "");  

		//take a screenshot
		File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("target/" + System.currentTimeMillis() + action + ".png"));    	
	}*/
}