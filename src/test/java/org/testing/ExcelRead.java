package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		//1.Mention The Excel Location
		File f=new File("E:\\ecipse workspaces\\May2ndProject\\target\\TestData\\2ndmaybatch.xlsx");
		
		//2. Read the File From The location
		FileInputStream fin=new FileInputStream(f);
		
		//3. Mention The Type Of Workbook
		Workbook w=new XSSFWorkbook(fin);
		
		//4.Get The Sheet From The Workbook
		Sheet s=w.getSheet("Sheet1");
	
		Row cr = s.createRow(1);
		System.out.println(cr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
