package utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public void getRowCount() throws InvalidFormatException, IOException
	{
		File file = new File("./ExcelData/Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		int noofrow = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows: " +noofrow);
	}
	
	public void getCellData() throws InvalidFormatException, IOException
	{
		
	}
	
}
