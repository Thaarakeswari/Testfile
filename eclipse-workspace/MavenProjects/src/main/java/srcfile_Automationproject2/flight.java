package srcfile_Automationproject2;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class flight {

	WebDriver driver;
	@FindBy(xpath="//span[@class='logSprite icClose']")
	WebElement closebutton;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-83 TdSAp'])[1]")
	WebElement roundtrip;
	
	@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
	WebElement fromlocation;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement enterfromlocation;
	
	@FindBy(xpath="//div[@class='sc-12foipm-37 lfkrPI']/ul/li[1]")
	WebElement selectfromlocation;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement entertolocation;
	
	@FindBy(xpath="//div[@class='sc-12foipm-37 lfkrPI']/ul/li[1]")
	WebElement selecttolocation;
	
	@FindBy(xpath="(//p[text()='22'])[2]")
	WebElement  selectDate;
	
	@FindBy(xpath="(//span[text()='Done'])")
	WebElement confirmdate;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-64 dGRyPm'])[2]")
	WebElement adult;
	
	@FindBy(xpath="(//a[text()='Done'])")
	WebElement confirmnum;

	@FindBy(xpath="//span[text()='SEARCH FLIGHTS']")
	WebElement searchflight;
	@FindBy(xpath="//span[contains(text(),'showing')]")
	WebElement searchresults;
	

	public void closepopup()
	{
		closebutton.click();
	}
	
	public void select_roundtrip()
	{
		roundtrip.click();
	}
	
	public void fromcity()
	{
		fromlocation.click();		
	}
	
	public void enterfromcity()
	{
		enterfromlocation.sendKeys("BLR");
		enterfromlocation.sendKeys(Keys.ENTER);
	}
	public void select_fromlocation()
	{
		selectfromlocation.click();
	}
	
	public void entertocity()
	{
		enterfromlocation.sendKeys("DEL");
		enterfromlocation.sendKeys(Keys.ENTER);
	}
	
	public void select_tolocation()
	{
		selecttolocation.click();
	}
	
	public void select_date()
	{
		selectDate.click();
	}
	
	public void confirm_date()
	{
		confirmdate.click();
	}
	public void add_adult()
	{
		adult.click();
	}
	
	public void confirm_passengernum()
	{
		confirmnum.click();
	}
	
	public void search_flight()
	{
		searchflight.click();
	}
	
	public boolean is_searchsuccessfull()
	{
		boolean pass=searchresults.isDisplayed();
		return pass;
	}
	
	public flight(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}

