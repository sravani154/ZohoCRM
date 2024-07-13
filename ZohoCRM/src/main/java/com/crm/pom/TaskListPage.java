package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement customerbtn;
	@FindBy(id="customerLightBox_nameField")
	private WebElement customernametb;
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
	public void customernametb(String name) {
		customernametb.sendKeys(name);
	}

}
