package com.crm.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib  {
	static Workbook wb= null;
	public static String getExcelData(String sheetName,int row, int cell) {
		String data= null;
		try {
			FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
			  wb = WorkbookFactory.create(fis);
			 data  =wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
			 
		}
		catch(Exception  e) {
		}
		return data;
	}
	public void setData(String sheetName,int row, int cell,String value) {
		try {
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
	}
		catch(Exception  e) {
		}
		
	}	
	
	}		

