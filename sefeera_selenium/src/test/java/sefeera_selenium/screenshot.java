package sefeera_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile =ts.getScreenshotAs(OutputType.FILE);

		File destFile= new File("C:\\Users\\Administrator\\Pictures\\Screenshots.png");
		Files.copy(srcFile,destFile);
		driver.close();
		
	}
	}


