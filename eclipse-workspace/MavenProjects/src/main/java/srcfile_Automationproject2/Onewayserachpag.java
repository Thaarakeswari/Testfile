package srcfile_Automationproject2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Onewayserachpag {
	WebDriver driver;

	@FindBy(xpath = "//span[@class='logSprite icClose']")
	WebElement close;
	@FindBy(xpath = "(//li[@class='sc-12foipm-82 kEVACM'])[1]")
	WebElement roundtrip;
	@FindBy(xpath ="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
	WebElement from;
	@FindBy(xpath ="//input[@type='text']")
	WebElement fromtext;
	@FindBy(xpath = "//input[@type='text']")
	WebElement totext;
	@FindBy(xpath = "(//div[@class='DayPicker-Day'][2]/p)[3]")
	WebElement date;
	@FindBy(xpath = "//span[.='Done']")
	WebElement done; 
	@FindBy(xpath = "(//*[local-name()='svg' and @width='15'])[2]")
	WebElement adults; 
	@FindBy(xpath = "(//*[local-name()='svg' and @width='15'])[4]")
	WebElement child; 
	@FindBy(xpath = "//ul[@class='sc-12foipm-58 juWqGL']/li[3]")
	WebElement business; 
	@FindBy(xpath = "//ul[@class='sc-12foipm-58 juWqGL']/li[4]")
	WebElement firstclass; 
	@FindBy(xpath = "//a[.='Done']")
	WebElement done1; 
	@FindBy(xpath = "//span[.='SEARCH FLIGHTS']")
	WebElement serachflight; 
	@FindBy(xpath = "//span[contains(text(),'showing')]")
	WebElement searchresult; 
	@FindBy(xpath = "//div[contains(text(),'Sorry, we could not find any flights')]")
	WebElement firstclasssearchresult; 
	public void closelogin()
	{
		close.click();
	}

	public void roundtrip()
	{
		roundtrip.click();
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
		totext.sendKeys("B");
		totext.sendKeys(Keys.ARROW_DOWN);
		totext.sendKeys(Keys.ENTER);
	}
	public void date()
	{
		date.click();
	}
	public void done()
	{
		done.click();
	}
	public void adults(WebDriver driver)
	{
		 Actions act = new Actions(driver);
	      act.moveToElement(adults).click().build().perform();
	}
	public void child(WebDriver driver)
	{
		Actions act = new Actions(driver);
	      act.moveToElement(child).click().build().perform();
	}
	public void business()
	{
		business.click();
	}
	public void firstclass()
	{
		firstclass.click();
	}
	public void done1()
	{
		done1.click();
	}
	public void serachflight()
	{
		serachflight.click();
		
	}
public boolean searchresult()
	{
		
		boolean b6=searchresult.isDisplayed();
		return b6;
	}
public boolean firstclasssearchresult()
{
	
	boolean b6=firstclasssearchresult.isDisplayed();
	return b6;
}
	public Onewayserachpag(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}
