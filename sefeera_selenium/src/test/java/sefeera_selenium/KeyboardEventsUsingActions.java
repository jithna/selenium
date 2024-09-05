package sefeera_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventsUsingActions {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/text-box");

		Actions actions = new Actions(driver);

		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Mr.Peter Haynes");
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("PeterHaynes@toolsqa.com");

		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 School Lane London EC71 9GO");
		actions.keyDown(Keys.CONTROL);

		actions.sendKeys("a");

		actions.keyUp(Keys.CONTROL);

		actions.build().perform();

		actions.keyDown(Keys.CONTROL);

		actions.sendKeys("c");

		actions.keyUp(Keys.CONTROL);

		actions.build().perform();

		actions.sendKeys(Keys.TAB);

		actions.build().perform();

		actions.keyDown(Keys.CONTROL); actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);

		actions.build().perform();

		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
		Thread.sleep(3000);
		driver.close(); 
	}

	private static void assertEquals(String attribute, String attribute2) {
		// TODO Auto-generated method stub
		
	}


		// TODO Auto-generated method stub
		
	}


