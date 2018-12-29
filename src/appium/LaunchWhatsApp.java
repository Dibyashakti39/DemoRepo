package appium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LaunchWhatsApp {
  @Test
  public void f() throws Exception {
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setCapability("deviceName", "0123456789ABCDEF");
	  dc.setCapability("platformVersion", "6.2.2");
	  dc.setCapability("platformName", "Android");
	  
	  
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  
	  WebDriver driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	  
	  
  }
}
