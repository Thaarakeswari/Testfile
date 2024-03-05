package srcfile_Automationproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testdataloginairlineapplication.Testdata_logindetails;

public class login extends Testdata_logindetails{
	WebDriver driver;
	@FindBy(xpath="//input[@name='phone']")
	WebElement phno;
	@FindBy(xpath="//button[.='Continue']")
	WebElement continuebutton;
	@FindBy(xpath="//h3[@class='successMsg__title']")
	WebElement message;
	@FindBy(xpath="//p[@class='errorMessage']")
	WebElement message1;
	@FindBy(xpath="//button[.='I’ll do it later']")
	WebElement next;
@FindBy(xpath="//input[@placeholder='Enter your email address']")
WebElement mail1;
@FindBy(xpath="//button[.='Lets Go']")
WebElement gobutton;
public void phoneno()
{
	phno.sendKeys(mobileno);
}
public void continuebutton()
{
	continuebutton.click();
}
public void otp() throws InterruptedException
{
	Thread.sleep(5000);
}
public String successfulloginmessage()
{
	String m1=message.getText();
	return m1;
}
public String invalidloginmessage()
{
	String m2=message1.getText();
	return m2;
}
public void nextbutton()
{
	next.click();
}
//public void mail()
//{
//	mail1.sendKeys(mail);
//}
//public void gobutton()
//{
//	gobutton.click();
//}
public login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
