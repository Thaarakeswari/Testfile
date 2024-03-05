package srcfile_Automationproject2;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	WebDriver driver;
@FindBy(id="user-info-tab")
WebElement info;
@FindBy(xpath="//div[@data-id='header-dropdown']/li/buttonuser-info-tab")
WebElement signin;
@FindBy(xpath="//input[@class='loginCont__input']")
WebElement mobileno;
@FindBy(xpath="//button[.='Continue']")
WebElement continue1;
@FindBy(xpath="//div[@class='verifyOtpCont__otpCont']")
WebElement otp;
public void infohover(WebDriver driver)
{
	Actions a1=new Actions(driver);
	a1.moveToElement(info).perform();
}
public void signin()
{
	signin.click();
}
public void mobileno()
{
	mobileno.sendKeys("9171450150");
}
public void continue1button()
{
	continue1.click();
}
public void otp()
{
	otp.sendKeys("");
}
public Registrationpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
