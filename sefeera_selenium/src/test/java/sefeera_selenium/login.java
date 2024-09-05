package sefeera_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

				driver.get("http://demo.medlablive.in");

				driver.findElement(By.id("user_name")).sendKeys("demo");

				driver.findElement(By.id("password")).sendKeys("demo1212");

				driver.findElement(By.name("Login")).click();

				Thread.sleep(3000);
				System.out.println("hello world");

				}
	}


