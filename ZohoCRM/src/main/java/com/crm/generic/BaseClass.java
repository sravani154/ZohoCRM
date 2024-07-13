package com.crm.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.crm.pom.LoginPage;

public class BaseClass  {
	public WebDriver driver;
	FileLib f= new FileLib();
	String un=f.getExcelData("Login", 1, 1);
	String pw=f.getExcelData("Login", 2, 1);
	LoginPage l= new LoginPage(driver);
	
	@BeforeTest
	public void OpenBrowser() {
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("opening Browser");
		
	}
	
	@BeforeMethod
	public void login() {
		LoginPage l= new LoginPage(driver);
		l.login(un, pw);
		
	}
	@AfterMethod
	public void close() {
		LoginPage l= new LoginPage(driver);
		l.logout();
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	}
	



