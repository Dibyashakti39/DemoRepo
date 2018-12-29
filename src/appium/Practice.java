package appium;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Practice {
@Test
public void f() throws Exception{
	DesiredCapabilities dc =new DesiredCapabilities();
	dc.setCapability("deviceName", "9b000c15");
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "5.0.2");
	dc.setCapability("appPackage", "com.opera.mini.native");
	dc.setCapability("appActivity", "com.opera.mini.android.Browser");
	AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	Thread.sleep(3000);
	
	driver.findElement(By.name("Search or enter address")).sendKeys("ipl");
	driver.findElementByAccessibilityId("SEARCH").click();
	
	
	
}
}
