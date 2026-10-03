package AppiumDriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidStudio 
{
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void androidStudio() throws MalformedURLException {
			  
			  // add capabilities 
		  DesiredCapabilities cap=new DesiredCapabilities(); 
		  cap.setCapability("platformName","android"); // platform 
		  cap.setCapability("appium:automationName","uiautomator2"); // ---->uiautomator2 framework to windows  , XCUI framework to iOS 
		  cap.setCapability("appium:deviceName","pixel_10_pro");
		  cap.setCapability("appium:udid","emulator-5554");    //unique device identification number
		  cap.setCapability("appium:platformVersion","16.0");  
		  
		  String path=System.getProperty("user.dir")+"//src//test//resourcesbitbar-sample-app.apk";
		  cap.setCapability("appium:app","path"); // application under test
		  
		  // appium server detais
		  URL url=new URL("http://0.0.0.0:4723");
		  
		  // create a driver session
		  AppiumDriver driver=new AndroidDriver(url,cap);
		  System.out.println("Session ID:"+driver.getSessionId());
		  
		
		 
		
	}

}
