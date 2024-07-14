package com.crm.testcript;

import org.testng.annotations.Test;

import com.crm.generic.BaseClass;
import com.crm.generic.FileLib;
import com.crm.pom.EnterTimeTrackPage;
import com.crm.pom.TaskListPage;

public class CreateCust extends BaseClass{
	FileLib f= new FileLib();
	String cname=f.getExcelData("taskpage", 0, 1);
	String cdesc=f.getExcelData("taskpage", 1, 2);
	@Test
	public void createcust() {
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.clicktaskbtn();
		TaskListPage t= new TaskListPage(driver);
		t.clickaddnewbtn();
		t.clickcustomerbtn();
		t.createcust(cname, cdesc);
	}
	
	

}