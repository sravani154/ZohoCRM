package com.crm.testcript;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.generic.BaseClass;
import com.crm.pom.EnterTimeTrackPage;
import com.crm.pom.TaskListPage;

public class login extends BaseClass {
@Test
public void log() {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains("Enter"));
	
	String etitle="actiTIME - Enter Time-Track";
	String atitle=driver.getTitle();
	Assert.assertEquals(etitle, atitle);
	Reporter.log("HomePage is displayed",true);
	
}
	

}
