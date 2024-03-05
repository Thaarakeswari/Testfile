package srcfile_Automationproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdditionalCost {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='goPromo']")
	WebElement couponcode;
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement apply;
}
