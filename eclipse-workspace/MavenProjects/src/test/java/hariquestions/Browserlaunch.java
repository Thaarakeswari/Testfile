package hariquestions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browserlaunch {

	@Test
	public void launch()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		

	}

}
