import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class MobileBrowserLaunching extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException {
		AppiumDriver<AndroidElement>driver=capabilities();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByName("email").sendKeys("mnukala29@gmail.com");
		driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("Mahesh123");
		driver.findElementByXPath("//*[@id='u_0_5']").click();
		
	}

}
