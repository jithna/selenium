package sefeera_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();

		obj.get("http://demo.guru99.com/test/radio.html");

		WebElement radio1=obj.findElement(By.id("vfb-7-1"));

		WebElement radio2=obj.findElement(By.id("vfb-7-2"));

		radio1.click();

		System.out.println("Radio button 1 selected");

		radio2.click();

		System.out.println("Radio button 2 selected");

		WebElement checkbox1=obj.findElement(By.id("vfb-6-0"));

		WebElement chackbox2=obj.findElement(By.id("vfb-6-1"));

		checkbox1.click();

		if (checkbox1.isSelected()) {

		System.out.println("check box1 is selected");

		}

		else

		{

		System.out.println("Check box is not selected");

		}


		Thread.sleep(3000);

		obj.close();
	}

}
