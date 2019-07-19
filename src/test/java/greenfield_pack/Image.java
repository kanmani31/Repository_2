package greenfield_pack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;

import org.openqa.selenium.WebDriver;



public class Image {
  @Test
 {
	  public static String takescreenshot(WebDriver driver) throws IOException{
	  TakesScreenshot img=(TakesScreenshot)driver;
		  File src=img.getScreenshotAs(OutputType.File);
		  String des=("\"C:\\TestingBatch13&14\\image.html");
		  FileUtils.CopyFile(src,new File(des));
		  return des; 
		  
		  
	  }
  }


