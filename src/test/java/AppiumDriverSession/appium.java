package AppiumDriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class appium {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
		public static void appiumproject() throws MalformedURLException {
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("platformName","android");
			cap.setCapability("appium:automationName","uiautomator2");
			cap.setCapability("appium:deviceName","OnePlus Nord CE5");
			cap.setCapability("appium:platformVersion","16.0");
			cap.setCapability("appium:udid","emulator-5554");
			
           
			String path=System.getProperty("user.dir")+"//src//test//resourcesApiDemos-debug.apk";
			cap.setCapability("appium:path","path");
			
			URL url=new URL("http://0.0.0.0:4723");
			
			AppiumDriver driver=new AndroidDriver(url,cap);
			System.out.println("application started sucessfully");
			
		}

}
