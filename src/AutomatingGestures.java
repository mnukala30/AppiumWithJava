import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AutomatingGestures extends Base{

	public static void main(String[] args) throws MalformedURLException{
		
		AndroidDriver<AndroidElement> driver= capabilities("real");
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Tap
		TouchAction T = new TouchAction(driver);
		WebElement ele= driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		T.tap(tapOptions().withElement(element(ele))).perform();
		WebElement ele1= driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
		T.tap(tapOptions().withElement(element(ele1))).perform();
		WebElement ele2= driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		T.longPress(longPressOptions().withElement(element(ele2)).withDuration(ofSeconds(2))).release().perform();
		if(driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").isDisplayed()){
			System.out.println("Passed the test");
		}
		
		//T.press(pressOptions().withElement(element())).per
		
	}

}
