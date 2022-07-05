package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelalgo {
	
	private Integer testID;
	private String sheetName;

	public Excelalgo(String sheetName,Integer testId) {
	        
			this.testID = testId;
	        this.sheetName = sheetName;
	      
	    }
	
    
    public String GetUserName() {        
		String excelpath = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\DsalgoSignIn.xlsx";
		File newfile = new File(excelpath);
	    FileInputStream readexcel = null;
	    
		try {
			readexcel = new FileInputStream(newfile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	    XSSFWorkbook algoexcel = null;
		try {
			algoexcel = new XSSFWorkbook(readexcel);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    XSSFSheet algosheet = algoexcel.getSheet(this.sheetName);
	  
	  int rowcount = algosheet.getLastRowNum();
	  System.out.println("Rowcount: usern "+rowcount);
	  for(int rownum=1; rownum<=rowcount;rownum++) {
		 Row selectedRow =algosheet.getRow(rownum);
		//System.out.println("Rowdata : usern "+selectedRow.getCell(0)+" "+selectedRow.getCell(0).getCellType().toString());
		 
		 System.out.println("Rowdata : usernthis "+this.testID);
		 DataFormatter formatter = new DataFormatter();
		String requiredrow= formatter.formatCellValue(selectedRow.getCell(0));
		// System.out.println("Rowdata : usern after "+text);
		 if(this.testID.toString().equals(requiredrow))
		 {
			 System.out.println("if passed");
			 System.out.println("Rowdata : usern after conver"+selectedRow.getCell(1).getStringCellValue());
			 return selectedRow.getCell(1).getStringCellValue();
		 }
		 
		}
	  return "";
    }

	public String GetUserPassword() {        
		String excelpath = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\DsalgoSignIn.xlsx";
		File newfile = new File(excelpath);
	    FileInputStream readexcel = null;
		try {
			readexcel = new FileInputStream(newfile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	    XSSFWorkbook algoexcel = null;
		try {
			algoexcel = new XSSFWorkbook(readexcel);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    XSSFSheet algosheet = algoexcel.getSheet(this.sheetName);
	  
	  int rowcount = algosheet.getLastRowNum();
	  for(int rownum=1; rownum<=rowcount;rownum++) {
		 Row selectedRow =algosheet.getRow(rownum);
		 DataFormatter formatter = new DataFormatter();
			String requiredrow2= formatter.formatCellValue(selectedRow.getCell(0));
		 if(this.testID.toString().equals(requiredrow2))
		 {
			 return selectedRow.getCell(2).getStringCellValue();
		 }
		 
		}
	  return "";
    }

	
}

