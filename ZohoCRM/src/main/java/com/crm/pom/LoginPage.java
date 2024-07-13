package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.generic.FileLib;

public class LoginPage {
	
	@FindBy(id="username")
	private  WebElement untb;
	@FindBy(name="pwd")
	private  WebElement pwtb;
	@FindBy(xpath="//div[text()='Login ']")
	private  WebElement loginbtn;
	@FindBy(id="logoutLink")
	private WebElement logout;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getUntb() {
		return untb;
	}
	public void setUntb(WebElement untb) {
		this.untb = untb;
	}
	public WebElement getPwtb() {
		return pwtb;
	}
	public void setPwtb(WebElement pwtb) {
		this.pwtb = pwtb;
	}
	public  void login(String un,String pw){
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginbtn.click();
	
		
	}
	public void logout() {
		logout.click();
	}
	
	
	
	
}
