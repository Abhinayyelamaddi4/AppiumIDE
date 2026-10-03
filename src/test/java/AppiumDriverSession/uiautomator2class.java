package AppiumDriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class uiautomator2class {
  @Test
  public void testdriversession() throws MalformedURLException {
	  
	  // add capabilities 
  UiAutomator2Options option=new UiAutomator2Options(); 
 
  
  //String path=System.getProperty("user.dir")+"//src//test//resources//bitbar-sample-app.apk	";
  String path=System.getProperty("user.dir")+"//src//test//resourcesApiDemos-debug.apk";
  option.setCapability("appium:app","path"); // application under test
  
  // appium server detais
  URL url=new URL("http://0.0.0.0:4723");
  
  // create a driver session
  AppiumDriver driver=new AndroidDriver(url,option);
  System.out.println("Session ID:"+driver.getSessionId());
  

  }
}
