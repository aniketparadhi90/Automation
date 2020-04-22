package driver_setup;

import org.testng.annotations.Test;
import Constant.Constantvalue;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class driversetup
{
	public WebDriver driver;
	Constantvalue cv=new Constantvalue();

  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", cv.path);
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }
  
  @Test
  public void geturl()
  {
	  driver.get(cv.Url);
  }

  @AfterTest
  public void afterTest()
  {
  }

}
