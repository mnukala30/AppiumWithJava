import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UsingAndroidUIAutomator extends Base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= capabilities("real");
		//driver.findElementByAndroidUIAutomator("attribute(\"value\")"); -> Syntax
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//To check the properties of an element in Appium(finding the properties of elements which has clickable is true
		
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}

}
