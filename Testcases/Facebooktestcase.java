package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLib.Driver;
import PageObjectRepositoryLib.Facebookpage;

public class Facebooktestcase {

	public static WebDriver driver = Driver.getBrowser();
	
	@Test
	public void login() {
		Facebookpage fbpage = PageFactory.initElements(driver, Facebookpage.class);
		fbpage.logintoapp();
		fbpage.createacc();
		
	}
	
}
