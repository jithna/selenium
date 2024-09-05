package sefeera_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SUDHIN/OneDrive/Desktop/page2.html");
		driver.switchTo().frame(0); driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().defaultContent(); driver.findElement(By.id("t2")).sendKeys("a");

		//using id attribute of the frame -string driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("b");

		driver.switchTo().defaultContent(); driver.findElement(By.id("t2")).sendKeys("b");

		//using name attribute of the frame -string driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("c"); driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("c");

		//using address of the frame -webelement

		WebElement f = driver.findElement(By.className("c1")); driver.switchTo().frame(f);
		driver.findElement(By.id("t1")).sendKeys("d"); driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("d");

		driver.close();
	}

}
