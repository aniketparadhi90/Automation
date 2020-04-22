package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Constant.Constantvalue;
import driver_setup.driversetup;

public class login extends driversetup
{
	Constantvalue cv=new Constantvalue();
	@Test
  public void logintoensemble() 
  {
		List <WebElement> logininput=driver.findElements(By.className("loginInput"));
		logininput.size();
		System.out.println(logininput.size());
		for(int i=0; i<logininput.size(); i++)
		{
			String Loginidatr=logininput.get(i).getAttribute("name");
			if(Loginidatr.equalsIgnoreCase("CacheUserName"))
			{
				logininput.get(i).sendKeys(cv.loginid);
			}
			else if(Loginidatr.equalsIgnoreCase("CachePassword"))
			{
				logininput.get(i).sendKeys(cv.password);
			}
		}
		WebElement submit=driver.findElement(By.className("button"));
		submit.click();
  }
}
