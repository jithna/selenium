package sefeera_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardmouseoperater {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/"); 
		
		

		Robot r = new Robot();

		r.mouseMove(300, 500);

		r.keyPress(KeyEvent.VK_ALT);

		r.keyPress(KeyEvent.VK_F);

		r.keyRelease(KeyEvent.VK_F);

		r.keyRelease(KeyEvent.VK_ALT); 
		Thread.sleep(3000);

	    r.keyPress(KeyEvent.VK_W);

		r.keyRelease(KeyEvent.VK_W); 
		Thread.sleep(3000);

		driver.close();

		
	}

}
