package Framework.amazontestcase;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework.Amazon.ProductCatalogue;
import Framework.Amazon.TestData;

public class Addtocart extends TestData{
	
	
	@Test(dataProvider="getJsonData")
	public void addCart(HashMap<String,String> input) {
		ProductCatalogue prod=landingPage.logIn(input.get("email"),input.get("password"));
		
		
		//prod.addressToastdismiss();
		
		
		
		
		
	}
	@DataProvider
	public Object[][] getJsonData() throws IOException {
		List<HashMap<String,String>> data=getJsonData(System.getProperty("user.dir")+"\\src\\test\\java\\Framework\\Amazon\\TestData.json");
		return new Object[][] {{data.get(0)},{data.get(1)}};
		
		
		
	}

}
