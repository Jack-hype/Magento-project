package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility {
	
	public static void capturescreenshot(WebDriver driver,String filename) throws IOException
	{
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String DATETIME=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
	File dest= new File("\"C:\\Users\\Admin\\Pictures\\Saved Pictures\\jayesh.jpg");
	FileHandler.copy(src, dest);
	}
	
	
	public static String getdatafromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		String data;
     String path="C:\\Users\\Admin\\Documents\\amazonlogin.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		
		try
		{
			 data = book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		catch(Exception e)
		{
			double value= book.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
			long num=(long) value;
			data=Long.toString(num);
		}
		return data;
		
		
		
	}
}
