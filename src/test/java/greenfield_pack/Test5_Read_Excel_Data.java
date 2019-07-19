package greenfield_pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test5_Read_Excel_Data {
  @Test

	 
	    public void f() throws IOException {
	  	  
	  	  //define file location
	  	  File src=new File("C:\\TestingBatch13&14\\login.xlsx");
	  	  FileInputStream fis=new FileInputStream(src);
	  	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  	  XSSFSheet sheet1=wb.getSheetAt(1);
	  		
	  	  int fr=sheet1.getFirstRowNum();
	  	  System.out.println(fr);
	  	  int lastrow=sheet1.getLastRowNum();
	  	  System.out.println(lastrow);
	  		
	  		for(int i=0;i<=lastrow;i++){
	  		String a1= sheet1.getRow(i).getCell(0).getStringCellValue();
	  		System.out.println(a1);
	  		
	  		String a2= sheet1.getRow(i).getCell(1).getStringCellValue();
	  		System.out.println(a2);
	  		  System.setProperty("webdriver.chrome.driver","C:\\TestingBatch13&14\\chromedriver_win32\\chromedriver.exe");
	  		  WebDriver driver=new ChromeDriver();
	  		  driver.get("http://10.232.237.143:443/TestMeApp");
	  		  driver.findElement(By.partialLinkText("Sign")).click();  
	  		  driver.findElement(By.name("userName")).sendKeys(a1);
	  		  driver.findElement(By.name("password")).sendKeys(a2);
	  		  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  		  
	  		  driver.close();
	  		
	    }
  }
}
	  

  

