package com.sam.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sam.base.TestBase;


public class ContractPage extends TestBase {
	
	@FindBy(css = "")
	List<WebElement> Element1;
	
	public ContractPage() {

		PageFactory.initElements(driver, this);
		
	}
	

}
