package sefeera_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathusingAttribute {

			public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.saucedemo.com/v1/");
					String xp = "//input[@id='user-name']";
				Thread.sleep(2000);
				driver.findElement(By.xpath(xp)).sendKeys("standard_user");
				  
				Thread.sleep(2000);
		        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
				Thread.sleep(2000);
			    driver.findElement(By.xpath("//input[@id='login-button']")).click();
				Thread.sleep(2000);
				WebElement logoutBtn = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
				Thread.sleep(4000);
				if (logoutBtn.isDisplayed())
				{
				System.out.println("Home page is displayed");
				} else{
				System.out.println("Home page is NOT displayed");
				}
				
			
			}

		

	

}
