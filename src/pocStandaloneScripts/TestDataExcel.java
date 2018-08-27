package pocStandaloneScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataExcel {

	public static void main(String[] args) throws IOException {
		
		//readExcel("C:\\Users\\977250\\Documents\\Automation Framework\\workspace\\Test Data","TestData.xlsx","TestData",2,1);
		System.out.println(readTestDataExcel(2,1));

	}
	
	public static void readExcel(String filePath,String fileName,String sheetName, int rownum, int col) throws IOException{

	    //Create an object of File class to open xlsx file
	    File file =    new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook wbook = null;

	    //If it is xlsx file then create object of XSSFWorkbook class
	    wbook = new XSSFWorkbook(inputStream);

	    //Read sheet inside the workbook by its name
	    Sheet sheet = wbook.getSheet(sheetName);

	    //Find number of rows in excel file
	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console
	            System.out.print(row.getCell(j).getStringCellValue());

	        }

	        System.out.println();
	    }
	    
	   System.out.println( sheet.getRow(rownum-1).getCell(col-1).getStringCellValue());

	    wbook.close();
	}
	
	public static String readTestDataExcel(int rownum, int col) throws IOException{
		
		//initialize test data sheet file path and name		
		String filePath="C:\\Users\\977250\\Documents\\Automation Framework\\workspace\\Test Data";
		String fileName="TestData.xlsx";
		String sheetName="TestData";
		
	    //Create an object of File class to open xlsx file
	    File file = new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook wbook = null;

	    //If it is xlsx file then create object of XSSFWorkbook class
	    wbook = new XSSFWorkbook(inputStream);

	    //Read sheet inside the workbook by its name
	    Sheet sheet = wbook.getSheet(sheetName); 
	    String cellVal= sheet.getRow(rownum-1).getCell(col-1).getStringCellValue();
	    wbook.close();
	    
	    return cellVal;
	}
}
