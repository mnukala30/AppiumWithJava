package GeneralStore;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gstore_tc_2 extends Base{
	
	//To fill the form and identify the toast messages and print on screen

	public static void main(String[] args) throws MalformedURLException {
		
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
		
		//To select the child element of above parent object
		List<AndroidElement> list = driver.findElementsById("com.androidsample.generalstore:id/productName");
		
		for(int i=0;i<list.size();i++){
			if(list.get(i).getText().equalsIgnoreCase("Jordan 6 Rings")){
				driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();
				driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();
				break;
			}
		}
			driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
			
	}

}
