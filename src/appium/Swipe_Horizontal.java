package appium;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Swipe_Horizontal {
	public DesiredCapabilities dc;
	public AndroidDriver<WebElement> driver;
  @Test
  public void f() throws Exception {
driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("Apps")).click();
for (int i = 0; i <3; i++) 
{
	List<WebElement> str = driver.findElements(By.className("android.widget.TextView"));
 	System.out.println(str.size());
	for (int j = 0; j < str.size(); j++) 
	{
		System.out.println(str.get(j).getText());
		
	}
	
	Thread.sleep(2000);
	driver.swipe(360, 423, 9, 423,1000);//Horizontal from right to left
	
}
for (int k = 2; k >0; k--)
  {
  Thread.sleep(1000);
  driver.swipe(9, 423, 360, 423, 1000);//Horizontal from left to right
  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "0123456789ABCDEF");
	  dc.setCapability("platformVersion", "4.2.2");
	  dc.setCapability("platformName", "Android");	  
	  dc.setCapability("appPackage", "com.android.launcher3");
	  dc.setCapability("appActivity", "com.android.launcher2.Launcher"); 	  
  }

  @AfterTest
  public void afterTest() throws Exception{
	  Thread.sleep(5000);
	  driver.quit();
  }

}
