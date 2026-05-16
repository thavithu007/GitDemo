package Framework.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.abstractcomponents.AbstractComponents;




public class Landingpage extends AbstractComponents{
	WebDriver driver;
	
	public Landingpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "userEmail")
	WebElement email;

	@FindBy(id = "userPassword")
	WebElement password;

	@FindBy(id = "login")
	WebElement submit;
	

	
	public void goTo() {
		driver.get("http://rahulshettyacademy.com/client");
		
		
	}

	
		public ProductCatalogue logIn(String eMail, String passWord) {
			email.sendKeys(eMail);
			password.sendKeys(passWord);
			submit.click();
			ProductCatalogue productCatalogue=new ProductCatalogue(driver);
			return productCatalogue;
		}
		
		

}
