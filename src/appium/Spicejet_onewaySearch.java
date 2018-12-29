package appium;

import org.testng.annotations.Test;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Spicejet_onewaySearch {
	public DesiredCapabilities dc;
	public WebDriver driver;
	public void type(By loc , String str){
		driver.findElement(loc).sendKeys(str);
	}
	public void click(By loc){
		driver.findElement(loc).click();
	}
	public void search(String adult , String child ,String infant){
		driver.findElement(By.name(adult));
		driver.findElement(By.name(child));
		driver.findElement(By.name(infant));
		
	}
  @Test
  public void f() throws Exception {
 dc = new DesiredCapabilities();
	  
	  dc.setCapability("deviceName", "0123456789ABCDEF");
	  dc.setCapability("platformVersion", "4.2.2");
	  dc.setCapability("platformName", "Android");
	  
	  
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity", "com.vl.spicejet.modules.dispatchmodule.SplashScreenActivity");
	  
	  driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	  Thread.sleep(3000);
	  click(By.name("Flight Booking"));
	  click(By.name("One Way"));
	  click(By.name("HYD"));
	  type(By.name("Start typing a name / code"), "hy");
	 // driver.findElement(By.name("Start typing a name / code")).sendKeys("hy");
	  Thread.sleep(3000);
	  click(By.name("Hyderabad, HYD"));
	  Thread.sleep(3000);
	  click(By.name("DEL"));
	  type(By.name("Start typing a name / code"),"ben");
	  Thread.sleep(3000);
	  click(By.name("Bengaluru, BLR"));
	  click(By.name("DEPART ON"));
	  click(By.name("10"));
	  click(By.name("TRAVELLERS"));
	 /* search("2","1","1");
	  search("3", "2", "0");
	  search("4", "3", "2");*/
	  //driver.findElement(By.xpath("//android.widget.Button[@text='0'][@index='1']")).click();
	  
 
	  
  }
	  
	  
  

}
