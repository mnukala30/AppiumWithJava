import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseUsingPackageAndActivity {

			
		public static AndroidDriver<AndroidElement> capsUsingPackage() throws MalformedURLException
		{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//device name should be actual device name or Andoid Device
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme 2 Pro"); OR 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		//cap.setCapability(MobileCapabilityType.PLATFORM, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		//cap.setCapability("appPackage", "net.one97.paytm");
		//cap.setCapability("appActivity", ".AJRMainActivity");
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.whatsapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".HomeActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, "True");
		
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
		}
	}


