package jenkinstest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserTest {
	
	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void loadBroser() {
		startTime = System.currentTimeMillis();
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe"
		 * );
		 */	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test
	public void flipkart() {
		driver.get("https://www.flipkart.com/");
		/*
		 * long timeMillis = System.currentTimeMillis(); System.out.println(timeMillis);
		 */
	}

	@Test
	public void amzone() {
			driver.get("https://www.amazon.in/");
			/*
			 * long timeMillis = System.currentTimeMillis(); System.out.println(timeMillis);
			 */
	}

	@Test
	public void snapDeal() {
		
		driver.get("https://snapdeal.com/");
		/*
		 * long timeMillis = System.currentTimeMillis(); System.out.println(timeMillis);
		 */
	}
	
	@AfterSuite
	public void closeBroser() {
		driver.close();
		endTime = System.currentTimeMillis();
		System.out.println(startTime-endTime);
	}

}
