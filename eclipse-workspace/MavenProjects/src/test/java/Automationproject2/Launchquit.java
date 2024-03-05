package Automationproject2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import srcfile_Automationproject2.login;
import testdataloginairlineapplication.Testdata_logindetails;

public class Launchquit {
	WebDriver driver;
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.goibibo.com/");
	
}
	@AfterMethod
	public void logout() throws IOException
	{
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src=ts1.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\HARI\\eclipse-workspace\\MavenProjects\\src\\test\\java\\AutomationProject1screenshots\\Screenshots project1"+getClass()+Math.random()+".png");
		FileUtils.copyFile(src, des);
		//driver.quit();
	}
}
