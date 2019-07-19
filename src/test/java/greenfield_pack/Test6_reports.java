package greenfield_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test6_reports {
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\TestingBatch13&14\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  if(driver.getTitle().contains("Mercury")) {
			  test.log(LogStatus.PASS,"Login Passed","Login done successfully");
		  }
		  else {
			  test.log(LogStatus.FAIL,test.addScreenCapture(Image.takescreenshot(driver)),"Login is not executed successfully");
}
	     driver.close();	  
  }
  @BeforeClass
  public void bc() {
	  report=new ExtentReports("C:\\TestingBatch13&14\\report1.html",false);
	  test=report.startTest("Test6_reports");
  }
  @AfterClass
  public void ac() {
	  report.flush();
	  report.endTest(test);
	  
  }
  
  }

