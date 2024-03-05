package srcfile_Automationproject2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Couponcode {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='goPromo']")
	WebElement couponcode;
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement apply;
//	@FindBy(id="Billing Address")
//	WebElement BillingAddress;
//	@FindBy(id="Pincode")
//	WebElement pincode;
	@FindBy(xpath="//select[@class='common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 lpjPee']")
	WebElement gender;
	@FindBy(xpath="//input[@placeholder='First & Middle Name']")
	WebElement firstname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement mail;
	@FindBy(xpath="//button[.='Proceed']")
	WebElement proceed;
	@FindBy(xpath="//button[.='Secure my Trip']")
	WebElement securetrip;
	@FindBy(xpath="//button[.='That’s Correct']")
	WebElement button;
	@FindBy(xpath = "//div[.='Sorry! Promocode used is not applicable at the moment.']")
	WebElement promocode1;
	public void windowhandles(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		Set<String> id=driver.getWindowHandles();

		Iterator<String> id1=id.iterator();
		String parentid=id1.next();
		String childid=id1.next();
		driver.switchTo().window(childid);
	}
	public void securetrip() 
	{
		
		securetrip.click();
	}
//	public void BillingAddress() 
//	{
//		
//		BillingAddress.sendKeys("ATF4 AMRITHA APARTMENT");
//	}
//	public void pincode() throws InterruptedException 
//	{
//	Thread.sleep(1000);
//		pincode.sendKeys("641025");
//	}
	public void gender() 
	{
	
	Select s1=new Select(gender);
			s1.selectByValue("FEMALE");
				
	}
	public void firstname()
	{
		
		firstname.sendKeys("Thaara");
	}
	public void lastname()
	{
		
		lastname.sendKeys("SIVA");
	}
	
	public void email()
	{
		mail.sendKeys("thaarakeswari93@gmail.com");
	}
	
	public void proceed()
	{
		proceed.click();
	}
	public void button()
	{
		button.click();
	}
	public boolean proceed1()
	{
		boolean b=proceed.isDisplayed();
		return b;
	}
	public void apply()
	{
		apply.click();
	}
	public void couponcode()
	{
		couponcode.sendKeys("ABCD");
	}
	public boolean couponcodedisplay()
	{
		boolean cc=couponcode.isDisplayed();
		return cc;
	}
	public String promocode1()
	{
		
		driver.switchTo().alert();
		String n= promocode1.getText();
		return n;
	}

public	Couponcode(WebDriver driver) 
{
PageFactory.initElements(driver, this);
}
}
