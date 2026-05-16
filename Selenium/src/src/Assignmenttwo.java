package src;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Assignmenttwo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String el=driver.findElement(By.cssSelector("label[for='honda']")).getText();
		WebElement drop=driver.findElement(By.id("dropdown-class-example"));
		Select opt=new Select(drop);
		//drop.click();
		opt.selectByContainsVisibleText(el);
		driver.findElement(By.id("name")).sendKeys(el);
		driver.findElement(By.id("alertbtn")).click();
		Alert al=driver.switchTo().alert();
		String alertText=al.getText();
		Assert.assertTrue(alertText.contains(el));
		al.accept();
	}

}
