package Automationproject2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import srcfile_Automationproject2.login;
import testdataloginairlineapplication.Testdata_logindetails;

public class Question2_validlogin extends Launchquit {
	//verify usercan successfully register goibibo application.

		@Test
		public void registration() throws InterruptedException, EncryptedDocumentException, IOException
		{
			login a1=new login(driver);
			Testdata_logindetails.data();
			a1.phoneno();
			a1.otp();
			Assert.assertEquals("Congratulations",a1.successfulloginmessage());
			

			
		}

}
