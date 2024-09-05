package sefeera_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Administrator/Desktop/WebTable.html");
				List<WebElement>allRows=driver.findElements(By.xpath("//tr"));
				int totalRows=allRows.size();
				System.out.println("total number of rows present in the table is:"+totalRows);
				List<WebElement>allcolumns=driver.findElements(By.xpath("//th"));
				int totalcolumns=allcolumns.size();
				System.out.println("total number of columns present in the table is :"+totalcolumns);
				List<WebElement>allcells=driver.findElements(By.xpath("//th|//td"));

				int totalcells=allcells.size();
				System.out.println("total number of cells present in the table is:"+totalcells);
				int countnumbrvalue=0;
				int sum=0;
				int countnumbervalue=0;
				for (WebElement cell:allcells) {
				String cellvalue=cell.getText();
				try {
				int number=Integer.parseInt(cellvalue);
				System.out.println(""+number);
				countnumbervalue++;
				sum=sum+number;}catch(Exception e) {
				}
				}
				System.out.println("total count of numeric values is :"+countnumbervalue);
				System.out.println("total sum of all the numeric value is :"+sum);
				}
				
	

}
