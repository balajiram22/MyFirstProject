package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class FindLeadsPage extends Annotations{

	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(how=How.XPATH, using="//label[text()='Lead ID:']/following::input")  WebElement eleLeadID;
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")  WebElement eleFindLeadsBtn;
	
	//String newLeadID = "12345";
	
	public FindLeadsPage enterLeadIDForSearch(String newLeadID) {
		clearAndType(eleLeadID, newLeadID);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsBtn() {
		click(eleFindLeadsBtn);
		return this;
	}
	
	public ViewLeadPage clickRequiredLeadID(String newLeadID) {
		String currentLeadXpath = "//a[text()='" + newLeadID + "']";
		WebElement eleCurrentLeadID = driver.findElementByXPath(currentLeadXpath);
		click(eleCurrentLeadID);
		return new ViewLeadPage();
	}
	
	
	
	
	
}
