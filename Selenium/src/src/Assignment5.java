package src;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000");
		List<WebElement> value=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<value.size();i++) {
	    sum=sum+Integer.parseInt(value.get(i).getText());
		}
		System.out.println(sum);
		int total=Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim());
		System.out.println(total);
		Assert.assertEquals(sum, total);
		
		List<WebElement> product=driver.findElements(By.cssSelector("table.table-display td:nth-child(3)"));
		int rowTotal=product.size();
		System.out.println(rowTotal);
		List<WebElement> full=driver.findElements(By.cssSelector("table.table-display tr"));
		int rowFull=full.size();
		System.out.println("Number of rows present in the table is" + rowFull);
		String second=driver.findElement(By.cssSelector("table.table-display tr:nth-child(3)")).getText();
		System.out.println(second);
		List<WebElement> column=driver.findElements(By.cssSelector("table.table-display th"));
		System.out.println("Number of columns present in the table is" + column.size());

		

	}

}
