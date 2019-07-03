package MyAccount.com.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil1 {
	public static void main(String[] args){
		getrowcount();
	}
	public static void getrowcount() {
		
	try {
		System.getProperty("user.dir");

File src = new File(
				"C:\\Users\\E2E\\eclipse-workspace\\AutomationE2E\\src\\main\\java\\MyAccount\\com\\testdata\\getdata.xlsx");

		FileInputStream fip = new FileInputStream(src);
	// loaded excel sheet in form of bites
		
		
		XSSFWorkbook wb = new XSSFWorkbook(fip);
		
		XSSFSheet sheet= wb.getSheet("Sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
	} catch (IOException e) {
		e.getMessage();
		e.getCause();
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}


}
