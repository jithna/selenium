package sefeera_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/V4/index.php");

				String title = driver.getTitle();

				System.out.println("the title of the page is :"+ title);

				String currentUrl = driver.getCurrentUrl(); System.out.println("the URL of the page is :"+ currentUrl);

				String pageSource = driver.getPageSource();

				System.out.println("the source code of the page is :"+ pageSource);

				Thread.sleep(3000);

				driver.close();

				}
	}


