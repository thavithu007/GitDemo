package Framework.Amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogue {
	WebDriver driver;

	public ProductCatalogue(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[data-action-type='DISMISS']")
	WebElement addressToastDismiss;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(xpath="//div[@data-cy='title-recipe']/a/h2/span")
	List<WebElement> products;
	
	
	
	
	
	public void addressToastdismiss() {
		addressToastDismiss.click();
	}
	
	public WebElement getProductByName(String productName) {
		WebElement prod=products.stream().filter(p->p.getText().contains(productName)).findFirst().orElse(null);
		return prod;
		
	}
	
	public void addProductToCart(String productName) {
		WebElement prod=getProductByName(productName);
		prod.click();
		
		
		
	}
	
	
	

}
