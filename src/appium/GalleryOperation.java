package appium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GalleryOperation {

	@Test 
	public void f() throws Exception{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "0123456789ABCDEF");
		dc.setCapability("platformVersion", "4.2.2");
		dc.setCapability("platformName", "Android");
		
		dc.setCapability("appPackage", "com.android.music");
		dc.setCapability("appActivity", "com.android.music.MusicBrowserActivity");
     WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
     driver.findElement(By.name("Songs")).click();
     driver.quit();
	}

}
