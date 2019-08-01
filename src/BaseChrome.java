import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome {
	
	static AppiumDriver driver;
	public static AppiumDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		
		DesiredCapabilities caps= new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//caps.setCapability(MobileCapabilityType.UDID, "P8B4C18202004583");
		
		caps.setCapability(MobileCapabilityType.UDID,"HT453WM03486");
		//caps.setCapability("chromedriverExecutable", "./Users/Mahesh Nukala/node_modules/chromedriver/lib/chromedriver/chromedriver.exe");
		caps.setCapability("chromedriverExecutable", "C:/Drivers/chromedriver_win32 (2)/chromedriver.exe");
		caps.setCapability(MobileCapabilityType.NO_RESET, "True");
		
		driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		return driver;
	}

}
