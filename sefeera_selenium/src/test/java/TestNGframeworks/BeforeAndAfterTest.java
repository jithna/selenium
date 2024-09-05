package TestNGframeworks;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeAndAfterTest {
	public String baseUrl = "https://www.browserstack.com/";

	String driverPath = "C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe";

	public WebDriver driver ;

	 @BeforeTest
	    public void launchBrowser() {
	        System.out.println("Launching Chrome browser");
	        System.setProperty("webdriver.chrome.driver", driverPath);
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	    }

	    @Test
	    public void verifyHomepageTitle() {
	        String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	        String actualTitle = driver.getTitle();
	        AssertJUnit.assertEquals(actualTitle, expectedTitle);
	    }

	    @AfterTest
	    public void terminateBrowser() {
	        if (driver != null) {
	            driver.quit();  // Use quit() to close all browser windows and end the WebDriver session
	        }}

	}

