package greenfield_pack;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\TestingBatch13&14\\chromedriver_win32\\chromedriver.exe");
	  WebDriver ff=new ChromeDriver();
	  ff.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  ff.get("http://newtours.demoaut.com");
	  String T1=ff.getTitle();
	  System.out.println(T1);
	  //name locators
	  ff.findElement(By.name("userName")).sendKeys("mercury");
	  ff.findElement(By.name("password")).sendKeys("mercury");
	  ff.findElement(By.name("login")).click();
	  
	  //get page title
	  String T2=ff.getTitle();
	  System.out.println(T2);
	  //x-path locator
	  ff.findElement(By.xpath("//input[@value='oneway']")).click();
	  //drop down
	  Select fromcity=new Select(ff.findElement(By.name("fromPort")));
	  fromcity.selectByValue("Paris");
	  
	  Select tocity=new Select(ff.findElement(By.name("toPort")));
	  tocity.selectByValue("Seattle");
	  
	  
	  ff.findElement(By.xpath("//input[@value='Business']")).click();
	  ff.findElement(By.name("findFlights")).click();
	  
	  ff.findElement(By.linkText("SIGN-OFF")).click();
	  assertEquals(ff.getTitle(),"Sign-on: Mercury Tours");
	  ff.close();
	  
	  
	  
  }
}
