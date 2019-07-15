package com.w2a.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/*All initializing will be done through this
 * WebDriver
 * Properties
 * Logs
 * ExtentReports
 * DB
 * Excel
 * Mail
 */

//@BeforeSuite
public class TestBase {
	
	@BeforeMethod
	public void setUp(){
		
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("This is test method updated");
	}

}
