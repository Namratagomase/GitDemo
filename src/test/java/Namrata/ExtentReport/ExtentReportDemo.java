package Namrata.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	@BeforeTest
	public void config()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test Result");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Namrata");
		
	}
	
	
	@Test
	public void initialDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namrata\\Music\\chromedriver.exe" ); 	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.getTitle();
		
		
	}

}
