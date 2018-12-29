package appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WhatsApp_Msg {
	 public DesiredCapabilities dc;
	 public WebDriver driver;
  @Test
  public void f() throws Exception{
	  
driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath("//android.widget.TextView[@text='Hyd Bapu Permanent']")).click();
driver.findElement(By.xpath("//android.widget.EditText[@text='Type a message']")).click();
//driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Call']")).click();
driver.findElement(By.xpath("//android.widget.EditText[@text='Type a message']")).sendKeys("sorry bhul re paleila");
driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Send']")).click();

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
	  Thread.sleep(6000);
	  driver.quit();
  }

}
