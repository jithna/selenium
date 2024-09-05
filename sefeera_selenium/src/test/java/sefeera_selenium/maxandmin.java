package sefeera_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxandmin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.manage().window().minimize();
		Thread.sleep(3000);

		driver.manage().window().fullscreen();

		Thread.sleep(3000);

		driver.close();
	}

}
