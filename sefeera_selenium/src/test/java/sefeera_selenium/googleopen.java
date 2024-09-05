package sefeera_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleopen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.co.in/");
				Thread.sleep(3000);
				driver.close();
	}

}
