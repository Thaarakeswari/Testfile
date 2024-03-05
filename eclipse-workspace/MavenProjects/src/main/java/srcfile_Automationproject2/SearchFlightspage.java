package srcfile_Automationproject2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightspage {
	WebDriver driver;

	@FindBy(xpath = "(//span[.='Flight Details'])[1]")
	WebElement flightdetails;
	@FindBy(xpath = "(//span[.='Flight Information'])[1]")
	WebElement flightinforamtion;
	@FindBy(xpath = "(//span[.='Fare Details'])[1]")
	WebElement faredetails;
	@FindBy(xpath = "(//span[.='Baggage Rules'])[1]")
	WebElement baggagerules;
	@FindBy(xpath = "(//span[.='Cancellation Rules'])[1]")
	WebElement cancelrules;
	@FindBy(xpath = "(//input[@type='button'])[1]")
	WebElement bookflight;
	@FindBy(xpath = "(//button[@class='srp-card-uistyles__BookButton-sc-3flq99-21 gtPjNk dF justifyCenter alignItemsCenter f600'])[1]")
	WebElement viewfare;
	
	public void flightdetails()
	{
		flightdetails.click();
	}
	public boolean flightinforamtion()
	{
		boolean flightinfo=flightinforamtion.isDisplayed();
		return flightinfo;
	}
	public void faredetails(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(faredetails).click().build().perform();
	}
	public boolean faredetails()
	{
		boolean fare=faredetails.isDisplayed();
		return fare;
	}
	public void baggagerules(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(baggagerules).click().build().perform();
	}
	public boolean baggagerules()
	{
		boolean baggage=baggagerules.isDisplayed();
		return baggage;
	}
	public void cancelrules(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(cancelrules).click().build().perform();
	}
	public boolean cancelrules()
	{
		boolean cancel=cancelrules.isDisplayed();
		return cancel;
	}
	public void viewfare()
	{
		viewfare.click();
	}
	public void windowhandles(WebDriver driver)
	{
		Set<String> id=driver.getWindowHandles();

		Iterator<String> id1=id.iterator();
		String parentid=id1.next();
		String childid=id1.next();
		driver.switchTo().window(childid);
	}
	public void bookflight()
	{
		bookflight.click();
	}
public	SearchFlightspage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
}
