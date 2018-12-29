package appium;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WhatsApp_Scroll {
	public DesiredCapabilities dc;
	public AndroidDriver<WebElement> driver;
  @Test
  public void f() throws Exception {
driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElementByAndroidUIAutomator( "UiSelector().name(\"New chat\")").click();
driver.findElement(By.name("New chat")).click();
//driver.scrollTo("Arup");
//driver.findElementByAndroidUIAutomator( "UiSelector().text(\"Ds Mani\")").click();
  }
  @BeforeTest
  public void beforeTest() {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "0123456789ABCDEF");
	  dc.setCapability("platformVersion", "4.2.2");
	  dc.setCapability("platformName", "Android");	 
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main"); 	  
  }

  @AfterTest
  public void afterTest() throws Exception{
	  Thread.sleep(5000);
	  driver.quit();
  }
}
