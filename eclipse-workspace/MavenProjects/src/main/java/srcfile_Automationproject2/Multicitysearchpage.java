package srcfile_Automationproject2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multicitysearchpage {
	WebDriver driver;
	@FindBy(xpath = "//span[@class='logSprite icClose']")
	WebElement close;
	@FindBy(xpath="(//li[@class='sc-12foipm-82 kEVACM'])[2]")
	WebElement multicity;
	@FindBy(xpath ="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
	WebElement from;
	@FindBy(xpath ="//input[@type='text']")
	WebElement fromtext;
	@FindBy(xpath = "//input[@type='text']")
	WebElement totext;
	@FindBy(xpath = "(//div[@class='DayPicker-Day'])[4]/p[1]")
	WebElement datefirst;
	@FindBy(xpath = "//span[.='Done']")
	WebElement donefirst; 
	@FindBy(xpath = "//div[@class='sc-12foipm-75 iBFWhg']/a[2]")
	WebElement travellersdone; 
	@FindBy(xpath ="((//div[@class='sc-12foipm-16 wRKJm fswFld ']))[5]")
	WebElement secondfrom;
	@FindBy(xpath ="//input[@type='text']")
	WebElement secondfromtext;
	@FindBy(xpath ="//input[@type='text']")
	WebElement secondtotext;
	@FindBy(xpath = "(//div[@class='sc-12foipm-34 iHoHRr'])[6]")
	WebElement dateselect;
	@FindBy(xpath = "//div[@class='DayPicker-Day'][6]")
	WebElement date;
	@FindBy(xpath = "//div[@class='sc-12foipm-55 LpzjE']/span[2]")
	WebElement done; 
	@FindBy(xpath = "//span[.='SEARCH FLIGHTS']")
	WebElement serachflight; 

//	@FindBy(xpath = "//span[.='Done']")
//	WebElement done; 
//	@FindBy(xpath = "//span[.='SEARCH FLIGHTS']")
//	WebElement serachflight; 

	public void closelogin()
	{
		close.click();
	}

	public void multicity()
	{
		multicity.click();
	}

    public void from()
	{

		from.click();
	}
	public void text()
	{
		fromtext.sendKeys("COIM");
		fromtext.sendKeys(Keys.ENTER);
	}
	public void totext()
	{
		totext.click();
		totext.sendKeys("BE");
		totext.sendKeys(Keys.ENTER);
	}
	
	
	public void depaturedate()
	{
		datefirst.click();
	}
	public void deapturebutton()
	{
		donefirst.click();
	}
	public void Travellers()
	{
		travellersdone.click();
	}
	public void secondfrom()
	{
		secondfrom.click();
		
	}
	public void secondfromtext()
	{
		
		secondfromtext.sendKeys(Keys.ENTER);
		
	}
	
	public void secondtotext()
	{
		secondtotext.sendKeys("COIM");
		secondtotext.sendKeys(Keys.ENTER);
		
	}
//	public void dateselect()
//	{
//		dateselect.click();
//		
//	}
	public void date()
	{
		date.click();
		
	}
	
	public void done(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(done));
	done.click();
	}
	public void serachflight()
	{
		serachflight.click();
		
	}
	public Multicitysearchpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
