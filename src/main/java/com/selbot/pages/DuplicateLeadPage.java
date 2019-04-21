package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class DuplicateLeadPage extends Annotations{
	
	public DuplicateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using="submitButton") WebElement eleCreateLead;
	
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage();
	}
	
}
