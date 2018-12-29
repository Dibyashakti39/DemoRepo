package appium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WhatsApp_Launch {
	WebDriver driver;
	
  @Test
  public void f() throws Exception{
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "0123456789ABCDEF");
	  dc.setCapability("platformVersion", "4.2.2");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");	  
      driver=new RemoteWebDriver(new URL( "http://127.0.0.1:4723/wd/hub"), dc);	  
      driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']")).click();  
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@content-desc='Attach']")).click(); 
      driver.findElement(By.xpath("//*[@content-desc='Gallery']")).click(); 
      driver.findElement(By.xpath("//*[@index='1']")).click();
  
  
  }


}
