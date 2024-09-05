package sefeera_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");

						WebDriver driver = new ChromeDriver();
						driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Birds");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.name("btnK")).click();

		Thread.sleep(3000);

		driver.close();
	}

}
