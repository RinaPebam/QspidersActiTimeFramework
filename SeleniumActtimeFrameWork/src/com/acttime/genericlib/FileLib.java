package com.acttime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Deepak 
 * This class contain File related mtds , which is used to read
 *         the data from Excel & properties
 */
public class FileLib {
	/**
	 * its used get the property key value from commomData.properties
	 * 
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/commonData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
		return value;

	}

	/**
	 * its used to read data from Excel-WorkBook , based on USer argument
	 * 
	 * @param sheetName
	 * @param rowNum    ,celNum
	 * @return data
	 * @throws Throwable
	 */
	public String getExcelData(String sheetName, int rowNum, int celNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(celNum).getStringCellValue();
		wb.close();
		return data;

	}

	/**
	 * used to write data back to Excel based on user argument
	 * 
	 * @param sheetName
	 * @param           rowNum, celNum,data
	 * @throws Throwable
	 */
	public void setExcelData(String sheetName, int rowNum, int celNum, String data) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./data/testData.xlsx");
		wb.write(fos);
		wb.close();
	}

}
