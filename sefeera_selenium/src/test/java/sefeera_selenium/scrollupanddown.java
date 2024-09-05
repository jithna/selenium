package sefeera_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupanddown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("flowers");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.name("btnK")).click();

		JavascriptExecutor javaObject = (JavascriptExecutor) driver;

		javaObject.executeScript("window.scrollBy(0,9000)", "");

		Thread.sleep(3000);
		driver.close();
	}

}
