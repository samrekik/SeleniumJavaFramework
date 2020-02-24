package com.sam.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.sam.base.TestBase;


public class configTest extends TestBase {
	
	@BeforeSuite()
	public void setExtent() {

		extent = new ExtentReports("AutoReport/index.html", true);
		extent.addSystemInfo("Framework", "Page Object");
		extent.addSystemInfo("Author", "SAM");
		extent.addSystemInfo("Enviroment", "WINDOWS");
		extent.addSystemInfo("Test", "Test Name");

	}

	@AfterSuite()
	public void endReport() {

		extent.flush();

	}
	
	

}
