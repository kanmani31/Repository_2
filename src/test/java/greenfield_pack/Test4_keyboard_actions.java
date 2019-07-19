package greenfield_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4_keyboard_actions {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\TestingBatch13&14\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  
	  Assert.assertTrue(driver.getTitle().contains("Shop"));
	  
	  WebElement search=driver.findElement(By.name("q"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(search).sendKeys("computer").build().perform();
	  Thread.sleep(2000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).click().build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='Search']")).click();
	  driver.close();
  }
	   
  }

