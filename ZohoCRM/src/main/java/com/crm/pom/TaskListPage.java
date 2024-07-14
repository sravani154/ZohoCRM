package com.crm.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.crm.generic.FileLib;

public class TaskListPage {
FileLib f= new FileLib();
	String cname=f.getExcelData("taskpage", 2, 0);
	String cdesc=f.getExcelData("taskpage", 2, 1);
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement customerbtn;
	@FindBy(id="customerLightBox_nameField")
	private WebElement customernametb;
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerdesc;
	@FindBy(xpath="//button")
	private WebElement activecustomer;
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement customertype;
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcustbtn;
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]")
	private WebElement Allcust;
	
	@FindBy(xpath="//div[@class='subtitle ellipsis']")
	private WebElement searchcust;

	
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
	
	public WebElement getcustomerdesc() {
		return customerdesc;
	}
	public void setcustomerdesc(String cdesc) {
		this.customerdesc = customerdesc;
	}
	public void clickcust() {
		customerbtn.click();
	}
	public void createcust(String cname,String cdesc) {
		
			
			customernametb.sendKeys(cname );
			customerdesc.sendKeys(cdesc );
			activecustomer.click();
			customertype.click();
			createcustbtn.click();
			
			
			
		}
	public void searchcust() {
		Allcust.click();
		
	}
		
		
		
	
	
	
}
