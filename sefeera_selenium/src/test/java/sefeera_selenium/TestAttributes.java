package sefeera_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		String attribute = driver.findElement(By.name("email")).getAttribute("name");

		System.out.println("Attribute:" + attribute);

		String tagname=driver.findElement(By.name("email")).getTagName();

		System.out.println("tagname"+tagname);
	}

}
