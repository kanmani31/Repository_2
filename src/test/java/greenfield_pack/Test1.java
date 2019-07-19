package greenfield_pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Test1 {
	WebDriver driver;
  @Test
  public void f() {
	  String t1=driver.getTitle();
	  System.out.println(t1);
	  List<WebElement> allrows=driver.findElements(By.tagName("link"));
	  int count=allrows.size();
	  System.out.println(count);
	  driver.findElement(By.partialLinkText("Sign")).click();  
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  driver.findElement(By.id("password")).sendKeys("Password123");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  driver.findElement(By.id("myInput")).sendKeys("Headphone");
	  driver.findElement(By.name("val")).click();
	  driver.findElement(By.linkText("Home")).click();
  }
     
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\TestingBatch13&14\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("http://10.232.237.143:443/TestMeApp");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
