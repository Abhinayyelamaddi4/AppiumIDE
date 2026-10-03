package AppiumDriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorDefaultApp  {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			openCalculator();
		    }
	   catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
		    exp.printStackTrace();
			
		}
	}
		public static void openCalculator() throws MalformedURLException {
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("platformName","android");
			cap.setCapability("appium:automationName","uiautomator2");
			cap.setCapability("appium:deviceName","OnePlus Nord CE5");
			cap.setCapability("appium:platformVersion","16.0");
			cap.setCapability("appium:udid","emulator-5554");
			
            //cap.setCapability("appPackage","--->apk address<----"); use calculator apk
            //cap.setCapability("appActivity","--->apk activity address<----");
			String path=System.getProperty("user.dir")+"//src//test//resourcesApiDemos-debug.apk";
			cap.setCapability("appium:path","path");
			
			URL url=new URL("http://0.0.0.0:4723");
			
			AppiumDriver driver=new AndroidDriver(url,cap);
			System.out.println("application started");
			
			/*
			MobileElement one=driver.findElement(By.id("path of locator"));
			MobileElement plus=driver.findElement(By.id("path of locator"));
			MobileElement three=driver.findElement(By.id("path of locator"));
			MobileElement equal=driver.findElement(By.id("path of locator"));
			MobileElement result=driver.findElement(By.className("path of locator"));
			one.click();
			plus.click();
			three.click();
			equal.click();
			String res=result.getText();
			System.out.println("result :"+res);
			System.out.println("completed....");*/
		    
	}

}



