package TestNGframeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MedlabNewTest {
	WebDriver driver;

	@Test(priority = 1,description = "In step 1")

	public void f() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();

	}

	@Test(priority =2,description = "In step 2")

	public void a()

	{

	driver.get("http://demo.medlablive.in");

	driver.findElement(By.id("user_name")).sendKeys("demo");

	driver.findElement(By.id("password")).sendKeys("demo1212");

	driver.findElement(By.name("Login")).click();

	}
}
