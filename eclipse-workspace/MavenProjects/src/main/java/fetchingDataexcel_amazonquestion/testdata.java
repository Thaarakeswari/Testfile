package fetchingDataexcel_amazonquestion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;

public class testdata {
	public static String phno;
	public static String pwd;
	public static String emailincorrect;
	public static String password1incorrect;
	public static WebDriver driver;
	public static void data() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\HARI\\eclipse-workspace\\MavenProjects\\test-output\\Amazon_loginexcel.xlsx");
		Workbook w1=WorkbookFactory.create(fs);
		 phno=NumberToTextConverter.toText(w1.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue());
		 pwd=w1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	}
	public static void indata()  throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\HARI\\eclipse-workspace\\MavenProjects\\test-output\\Amazon_loginexcel.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		emailincorrect = NumberToTextConverter.toText(w1.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue());

		password1incorrect = w1.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();

	}
	
}

