package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
@FindBy(xpath="//a[@class='content tasks']")
private WebElement taskbtn;
public EnterTimeTrackPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clicktaskbtn() {
	taskbtn.click();
}
}
