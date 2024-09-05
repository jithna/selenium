package TestNGframeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderClasss {
	@Test(dataProvider = "dp")

	public void test(String s, String n) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("http://demo.guru99.com/v1");

	driver.findElement(By.name("uid")).sendKeys(s);

	driver.findElement(By.name("password")).sendKeys(String.valueOf(n));

	driver.findElement(By.name("btnLogin")).click();

	}

	@DataProvider

	public Object[] dp() {

	return new Object[][] { new Object[] { "mgr367952", "vygenaq" }, { "mgr367953", "bevYbYr" } };

	}
}
