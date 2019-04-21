package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.LoginPage;
import com.selbot.testng.api.base.Annotations;

public class TC002_DuplicateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_DuplicateLead";
		testcaseDec = "Login, Duplicate the given Lead and Verify";
		author = "Hema";
		category = "Regression";
		excelFileName = "TC002";
	} 

	@Test(dataProvider="fetchData") 
	public void createLead(String UserName, String Password, String LeadID) {
		new LoginPage()
		.enterUserName(UserName)
		.enterPassWord(Password) 
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterLeadIDForSearch(LeadID)
		.clickFindLeadsBtn()
		.clickRequiredLeadID(LeadID)
		.clickDuplicateLead()
		.clickCreateLead()
		.displayDuplicatedLeadID();
	}
	
}
