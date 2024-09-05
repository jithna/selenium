package sefeera_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleopen2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
Thread.sleep(3000);
driver.close();
}

}
