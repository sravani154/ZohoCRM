package com.crm.testcript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.generic.BaseClass;
import com.crm.pom.EnterTimeTrackPage;
import com.crm.pom.TaskListPage;

public class SearchCust extends BaseClass {
	String name="Dhaiwik";
	@Test
	public void search() {
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.clicktaskbtn();
		TaskListPage t= new TaskListPage(driver);
		t.searchcust();
		List<WebElement> cust = driver.findElements(By.xpath("//div[@class='subtitle ellipsis']"));
		System.out.println(cust.size());
			
			for(WebElement req:cust) {
				String ele=req.getText();
				
				if(ele.contains(name)) {
					System.out.println(name +"is found");
					
				}
				else {
					System.out.println(name + "is  not created");
				}
				
			}
		}
	}
	
	

	