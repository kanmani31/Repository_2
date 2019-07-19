package greenfield_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3_Actions {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\TestingBatch13&14\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  
	  //switching to frame
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  WebElement source=driver.findElement(By.id("draggble"));
	  WebElement target=driver.findElement(By.id("droppable"));
	  
	  //Action
	  Actions act=new Actions(driver);
	  act.dragAndDrop(source, target).build().perform();
	  Thread.sleep(2000);
	  
	  //come out from frame
	  driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("Demos")).click();
	  Assert.assertTrue(driver.getTitle().contains("Demos"));
	  driver.close();
	  
  }
}
