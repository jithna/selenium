package sefeera_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		org.openqa.selenium.Dimension dimen= driver.findElement(By.name("email")).getSize();

		System.out.println("height "+dimen.height);

		System.out.println("width "+dimen.width);
	}

}
