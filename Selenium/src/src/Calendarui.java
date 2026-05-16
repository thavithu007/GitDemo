package src;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendarui {
	public static void main(String[] args) {
		String month = "6";
		String date = "25";
		String year = "2035";
		String[] expectedList= {month,date,year};
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.cssSelector("div[class='cart'] a:nth-of-type(2)")).click();
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//button[contains(@class,'calendar-button')]")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__next-button")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> actualList=driver.findElements(By.cssSelector("input.react-date-picker__inputGroup__input"));
		for(int i=0;i<actualList.size();i++)
		{
			System.out.println(actualList.get(i).getAttribute("value"));
			Assert.assertEquals(actualList.get(i).getAttribute("value"),expectedList[i]);
		}
		driver.close();
		
		
		
		
		
		

	}

}
