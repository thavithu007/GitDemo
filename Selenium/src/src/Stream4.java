package src;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Stream4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<String> list1;
	
		//List<WebElement> elelmentList=driver.findElements(By.xpath("//tr/td[1]"));
		//List<String> originalList=elelmentList.stream().map(s->s.getText()).collect(Collectors.toList());
		//List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		//Assert.assertTrue(originalList.equals(sortedList));
		do {
			List<WebElement> elelmentList=driver.findElements(By.xpath("//tr/td[1]"));
			list1=elelmentList.stream().filter(s->s.getText().contains("Strawberry")).map(s->getPrice(s)).collect(Collectors.toList());
			list1.forEach(s->System.out.println("The Price of Strawberry is "+s));
			if(list1.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			
			
		}while(list1.size()<1);

	}

	private static String getPrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();

		return priceValue;
	}

}
