package thavithuacademy.ExtentReport;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Extent Results");
		reporter.config().setReportName("Extent Automation Results");
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Thavithu");
		
	}
	
	@Test
	public void demoExtent() {
		extent.createTest("Demo Extent");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		extent.flush();
		
		
	}

}
