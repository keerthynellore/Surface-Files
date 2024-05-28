package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class RediffTest {
	WebDriver driver;

	@Test
	public void f() {
		String title = driver.getTitle();
		System.out.println("title of this page is " + title);
		WebElement redifflink = driver.findElement(By.xpath("//a[text()='Rediffmail']"));
		redifflink.click();
		driver.navigate().back();
		WebElement news = driver.findElement(By.linkText("NEWS"));
		news.click();
		WebElement search = driver.findElement(By.id("srchquery_tbox"));
		search.sendKeys("green card", Keys.ENTER);

	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		WebElement homelink = driver.findElement(By.linkText("HOME"));
		homelink.click();
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.browser",
				"C:\\Users\\Mahika\\eclipse-workspace\\April17thAutomation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
