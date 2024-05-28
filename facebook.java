import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahika\\eclipse-workspace\\April17thAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://facebook.com");
		driver.navigate().to("https://amazon.in");
		driver.manage().window().maximize();
		driver.navigate().back();
		WebElement createacc = driver.findElement(By.xpath("//a[@role ='button' and @ajaxify='/reg/spotlight/']"));
			
		createacc.click();
		WebElement fname = driver.findElement(By.xpath("//input[@name ='firstname']"));
		
		fname.clear();
		fname.sendKeys("Keerthana");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Madhu");
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("5867867321");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		pass.sendKeys("mahishana123");
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		sc.selectByVisibleText("Nov");
		Select scday = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		scday.selectByVisibleText("13");
		Select scyear = new Select(driver.findElement(By.id("year")));
		scyear.selectByVisibleText("1983");
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		radio.click();
		WebElement signup = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
		signup.click();
		
}
}
