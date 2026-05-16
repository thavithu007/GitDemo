package src;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Relativelocpartialscreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name=driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
		WebElement rdb=driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(rdb)).click();
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		String pId=it.next();
		String cId=it.next();
		driver.switchTo().window(cId);
		driver.get("https://courses.rahulshettyacademy.com/l/products?sortKey=recommended&sortDirection=asc&page=1");
		String course=driver.findElement(By.cssSelector("[href*='/p/']")).getText();
		driver.switchTo().window(pId);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys(course);
		WebElement nil=driver.findElement(By.xpath("(//div[@class='container'])[3]"));
		File nil1=nil.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(nil1, new File("C:\\Users\\Vijayalakshmi\\logo.png"));
		
		

	}

}
