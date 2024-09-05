package sefeera_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("53920");

		driver.findElement(By.name("submit")).submit();

		Alert alert =driver.switchTo().alert();

		String alertMessage=driver.switchTo().alert().getText();

		System.out.println("alert message:"+alertMessage);

		Thread.sleep(5000);

		alert.accept();

		alert.dismiss();
	}

}
