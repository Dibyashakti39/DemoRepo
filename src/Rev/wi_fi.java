package Rev;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class wi_fi {
	@Test
	public void f() throws MalformedURLException, Exception{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "9b000c15");
		dc.setCapability("platformVersion", "Android");
		dc.setCapability("platformName", "6.0.1"); 
		dc.setCapability("appPackage", "com.android.launcher3");
		dc.setCapability("appActivity", "com.android.launcher2.Launcher");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		Thread.sleep(3000);
		driver.swipe(712, 856, 184, 856, 1000);
		Thread.sleep(3000);
		driver.findElement(By.name("Settings")).click();
		//driver.findElement(By.className(className))
		Thread.sleep(3000);
		driver.findElement(By.name("WLAN")).click();
		Thread.sleep(3000);
		String str =driver.findElementByXPath("//android.widget.TextView[@text='Connected']/preceding::android.widget.TextView[1]").getAttribute("name");
		System.out.println("wifi connected with : "+str);
		//driver.findElementByAndroidUIAutomator("new uiselector().text('WLAN')").click();
	}
	

}
