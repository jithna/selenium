package TestNGframeworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleurlTestNG {
	WebDriver driver1,driver2,driver3,driver4;

	@Test

	public void test1() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");

	driver1=new ChromeDriver();

	driver1.manage().window().maximize();

	driver1.get("https://www.google.co.in");

	driver1.findElement(By.name("q")).sendKeys("flowers");

	driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	driver1.findElement(By.name("btnK")).click();

	}

	@Test

	public void test2()

	{

	driver2=new ChromeDriver();

	driver2.manage().window().maximize();

	driver2.get("http://www,google.co.in");

	driver2.findElement( By.name("q")).sendKeys(null);

	}

	@Test

	public void test3()

	{

	driver3=new ChromeDriver();

	driver3.manage().window().maximize();

	driver3.get("http://demo.guru99.com/v3/");

	driver3.findElement(By.name("uid")).sendKeys("EsevYqy");

	driver3.findElement(By.name("password")).sendKeys("EsevYqy");

	driver3.findElement(By.name("btnLogin")).click();

	}

	@Test

	public void test4() throws InterruptedException

	{

	driver4=new ChromeDriver();

	driver4.manage().window().maximize();

	driver4.get("http://43.225.54.129/medlab/demo/");
	driver4.findElement(By.id("user_name")).sendKeys("demo");

	driver4.findElement(By.id("password")).sendKeys("demo1212");

	driver4.findElement(By.name("Login")).click();
Thread.sleep(3000);
driver4.close();
	}

	}

