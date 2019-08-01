package GeneralStore;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		
		File appDir = new File("src");
	     File app = new File(appDir, "General-Store.apk");
	     
		DesiredCapabilities cap= new DesiredCapabilities();
		
		if(device.equalsIgnoreCase("emulator")){
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus_5");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		
		}else if(device.equalsIgnoreCase("real")){
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");}
		
		cap.setCapability(MobileCapabilityType.NO_RESET, "True");
		
	//	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, value);
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;

	}

}
