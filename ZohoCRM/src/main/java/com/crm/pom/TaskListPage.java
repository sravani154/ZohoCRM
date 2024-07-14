package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.generic.FileLib;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement customerbtn;
	@FindBy(id="customerLightBox_nameField")
	private WebElement customernametb;
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerdesc;
	@FindBy(xpath="//*[@id=\"ext-gen83\"]")
	private WebElement activecustomer;
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement customertype;
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcustbtn;
	
	public TaskListPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickaddnewbtn() {
		addnewbtn.click();

}
	public WebElement getCustomernametb() {
		return customernametb;
	}
	public void setCustomernametb(WebElement customernametb) {
		this.customernametb = customernametb;
	}
	public void clickcustomerbtn() {
		customerbtn.click();

}
	public void createcust(String cname,String cdesc) {
		customernametb.sendKeys(cname);
		customerdesc.sendKeys(cdesc);
		customertype.click();
		activecustomer.click();
		createcustbtn.click();
	}
	
}
