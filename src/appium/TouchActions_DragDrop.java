package appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TouchActions_DragDrop {
	AndroidDriver<WebElement> driver;
	 DesiredCapabilities dc;
  @Test
  public void f() {
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Basic usage playground\")").click();

WebElement e1=driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.mobeta.android.demodslv:id/drag_handle\")");
WebElement e2=driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.mobeta.android.demodslv:id/drag_handle\").instance(4)");
TouchAction t=new TouchAction(driver);
t.longPress(e1).moveTo(e2).release().perform();
//driver.zoom(x, y);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "88829a48");
	  dc.setCapability("platformVersion", "5.1.1");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.mobeta.android.demodslv");
	  dc.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
 driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  }

  @AfterTest
  public void afterTest() {
  }

}
