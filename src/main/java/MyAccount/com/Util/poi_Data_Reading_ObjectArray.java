package MyAccount.com.Util;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poi_Data_Reading_ObjectArray {
	
	static FileInputStream file;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell data, cell, ExData;
	static FileOutputStream fout;

	public static Object[][] readData(String filepath, String sheetname) throws IOException {
		// reading the data from external XLSX file all rows and columns and
		// storing into Object [][] array can be used as Data provider further testing
				
		Object[][] Exceldata = null;
		try {
			file = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheet(sheetname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int startrow = 1;
		int startcol = 0;
		int usedrows = sheet.getLastRowNum();
		System.out.println("NO.used rows are  :" + usedrows);
		int usedcolumns = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No. of used columns are  :" + usedcolumns);
		Exceldata = new Object[usedrows][usedcolumns];
		int ei = 0;

		for (int i = startrow; i <= usedrows; i++, ei++) {
			int ej = 0;
			for (int j = startcol; j < usedcolumns; j++, ej++) {
				Exceldata[ei][ej] = sheet.getRow(i).getCell(j);
				data = sheet.getRow(i).getCell(j);
			//	 System.out.println(data);
			//	System.out.println(Exceldata[ei][ej]);
				System.out.println("Array[" +ei+"]["+ej+"] ==>Excel["+i+"]["+j+"] ==> "+Exceldata[ei][ej]);
			}
		/*	// to write on on the same file  in specified column
			cell = sheet.getRow(i).createCell(usedcolumns);
			cell.setCellValue("Test Passed ");
			fout = new FileOutputStream("C:\\Users\\user\\Desktop\\InputData_gmail.xlsx");
			workbook.write(fout);   */
			
			// To create a new file and along with  input file data also...... and write the 
			// on the specified column the result.......
			cell = sheet.getRow(i).createCell(usedcolumns);
			cell.setCellValue("Test Passed ");
			try{
			fout = new FileOutputStream("C:\\Users\\E2E\\eclipse-workspace\\AutomationE2E\\src\\main\\java\\MyAccount\\com\\testdata\\getdata.xlsx");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try{
			workbook.write(fout); 
			} catch(IOException e ){
				e.printStackTrace();				
			}			
		}
		return Exceldata;
	}
	public static String getData(){
		// if you want to read a specific row and column data from excel sheet
		
		ExData = null;
	try{
	ExData =sheet.getRow(2).getCell(2);
	System.out.println("Data in general concept :" +ExData);
	
	} catch(Exception e){
		e.printStackTrace();
	}
	// DataFormatter
	DataFormatter formatter = new DataFormatter();  // creates formatter
   Cell	cell =sheet.getRow(2).getCell(2);
   String data1 = formatter.formatCellValue(cell);
   System.out.println("Data in DataFormatter Format  :"+data1);		
  return data1;		
	}

	
	}


