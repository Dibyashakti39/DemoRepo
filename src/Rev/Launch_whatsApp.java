package Rev;

import java.net.URL;
import java.rmi.server.UID;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Launch_whatsApp {
	public AndroidDriver<WebElement> driver;
	@Test
	public void f() throws Exception{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "9b000c15");
		dc.setCapability("platformversion", "6.0.1");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "com.android.launcher3");
		dc.setCapability("appActivity", "com.android.launcher2.Launcher");	 
		driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		for (int i = 0; i < 4; i++) {
			List<WebElement> l= driver.findElements(By.className("android.widget.TextView"));
			for (int j = 0; j < l.size(); j++) {
				System.out.println(l.get(j).getText());
			}
			driver.swipe(536, 866, 8, 856, 1000);
		}
		//driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	//	driver.findElementByAndroidUIAutomator("UiSelector().text(\"Kakun\")").click();
		//driver.findElement(By.name("Kakun")).click();
	//	driver.findElement(By.name("Type a message")).sendKeys("hi");
	//	driver.findElement(By.id("com.whatsapp:id/send")).click();
		
	}

}
