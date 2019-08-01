package GeneralStore;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GStore_tc_3 extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver=capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("Mahesh");
		driver.hideKeyboard();
		driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElementById("android:id/text1").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bahrain\"))");
		driver.findElementByXPath("//*[@text='Bahrain']").click();
		driver.findElementByXPath("//android.widget.Button").click();
		//To get the complete list of products and then scrolling to particular text		
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))");
		//List<AndroidElement> list = driver.findElementsById("com.androidsample.generalstore:id/productName");
		
		
				driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
				driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
				driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
				
				List<AndroidElement> list=driver.findElementsById("com.androidsample.generalstore:id/productPrice");
				Thread.sleep(5000);
				Double total=0.0;
				for(int i=0;i<list.size();i++){
					total+= Double.parseDouble(list.get(i).getText().substring(1));
				}
				System.out.println("Total value of the cart is:"+ total);
				String actual= driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText().substring(2);
				System.out.println(actual);
				
				AndroidElement checkbox= driver.findElementByXPath("//android.widget.CheckBox");
				TouchAction T = new TouchAction(driver);
				
				T.tap(tapOptions().withElement(element(checkbox))).perform();
				
				AndroidElement terms=driver.findElementById("com.androidsample.generalstore:id/termsButton");
				T.longPress(longPressOptions().withElement(element(terms)).withDuration(ofSeconds(2))).release().perform();
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
				
				Thread.sleep(6000);
				Set<String>ContextNames=driver.getContextHandles();
				for(String contestName: ContextNames){
					System.out.println(contestName);
					}
				Thread.sleep(3000);
				driver.context("WEBVIEW_com.androidsample.generalstore");
				Thread.sleep(3000);
				driver.findElement(By.name("q")).sendKeys("hello");

				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				//assert.assertEquals(expect,actual);
				
	}

}
