import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PaytmExample extends BaseUsingPackageAndActivity{

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capsUsingPackage();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Moo Baby\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Type a message\")").sendKeys("Planned till 1 baby");
		Thread.sleep(3000);
		
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Send']").click();
		
	}

}
