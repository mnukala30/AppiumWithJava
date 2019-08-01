import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeExample extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver =capabilities("real");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		WebElement ele1= driver.findElementByXPath("//*[@content-desc='15']");
		WebElement ele2 = driver.findElementByXPath("//*[@content-desc='45']");
		
		TouchAction T = new TouchAction(driver);
		
		//Swipe= long press on one element for few seconds and move to another element and release
		T.longPress(longPressOptions().withElement(element(ele1)).withDuration(ofSeconds(2))).moveTo(element(ele2)).release().perform();
		
	}

}
