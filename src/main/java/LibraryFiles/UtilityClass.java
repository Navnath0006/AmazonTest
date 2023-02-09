package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
	
	public static String getpropfile(String key) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Prachi\\eclipse-workspace\\AmazonProductSearch\\TestData\\Prop.properties");
		Properties pro = new Properties();
		pro.load(file);
		String value = pro.getProperty(key);
		return value;
	}
	public static String getexceldata(int row , int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Prachi\\eclipse-workspace\\AmazonProductSearch\\TestData\\Amazon.xlsx");
		Sheet sheet1 = WorkbookFactory.create(file).getSheet("Amazon");
		String value = sheet1.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
}
