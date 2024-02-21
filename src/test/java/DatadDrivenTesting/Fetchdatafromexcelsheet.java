package DatadDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchdatafromexcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		 FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\Book.xlsx");
    Workbook workbook = WorkbookFactory.create(fis);
    Sheet sheet = workbook.getSheet("sheet1");
    Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	String url = cell.getStringCellValue();
	System.out.println(url);
	
		
	String username = row.getCell(1).getStringCellValue();
	String password = row.getCell(2).toString();
    System.out.println("name is" +username);
 	System.out.println("pass is " +password);
	
 	double num = row .getCell(3).getNumericCellValue();
 	boolean bool = row.getCell(4).getBooleanCellValue();
 	System.out.println(num);
	System.out.println(bool);
	
	
	
	}

}
