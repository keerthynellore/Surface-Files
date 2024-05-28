import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.browser",
				"C:\\Users\\Mahika\\eclipse-workspace\\April17thAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title of this page is " + title);
		WebElement redifflink = driver.findElement(By.xpath("//a[text()='Rediffmail']"));
		redifflink.click();
		driver.navigate().back();
		WebElement news = driver.findElement(By.linkText("NEWS"));
		news.click();
		WebElement search = driver.findElement(By.id("srchquery_tbox"));
		search.sendKeys("green card", Keys.ENTER);
		WebElement homelink = driver.findElement(By.linkText("HOME"));
		homelink.click();
		driver.close();
		
		
		

	}

}
