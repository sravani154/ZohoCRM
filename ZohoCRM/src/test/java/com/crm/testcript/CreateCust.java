package com.crm.testcript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.generic.BaseClass;
import com.crm.generic.FileLib;
import com.crm.pom.EnterTimeTrackPage;
import com.crm.pom.TaskListPage;

public class CreateCust extends BaseClass{
FileLib f= new FileLib();
	
	String cname=f.getExcelData("taskpage", 2, 0);
	String cdesc=f.getExcelData("taskpage", 2, 1);
	String name=cname;
	
	@Test
	public void createcust() {
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.clicktaskbtn();
		TaskListPage t= new TaskListPage(driver);
		t.clickaddnewbtn();
		t.clickcust();
		t.createcust(cname, cdesc);
			
}
}
			

