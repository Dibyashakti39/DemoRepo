package appium;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragAndDrop {
  @Test
  public void f() throws Exception {
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setCapability("deviceName", "0123456789ABCDEF");
	  dc.setCapability("platformVersion", "4.2.2");
	  dc.setCapability("platformName", "Android");
	  
	  
	  dc.setCapability("appPackage", "com.mobeta.android.demodslv");
	  dc.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
	  AndroidDriver<WebElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	   driver.findElementByAndroidUIAutomator("UiSelector().text(\"Basic usage playground\")").click();
	    // WebElement src =driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.mobeta.android.demodslv:id/drag_handle\")");
	 //  WebElement des = driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.mobeta.android.demodslv:id/drag_handle\").instance(4)");
	   WebElement src =driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.ImageView\")");
	   WebElement des = driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.ImageView\").instance(4)");
	  TouchAction t = new TouchAction(driver);
	   
	  t.longPress(src).moveTo(des).release().perform();
	  
  }
}
 