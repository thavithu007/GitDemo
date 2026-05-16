package src;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 {
	public static void main(String[]  args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		
		
		
		
	}

}
