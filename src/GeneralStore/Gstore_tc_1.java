package GeneralStore;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gstore_tc_1 extends Base{
	
	//To fill the form and identify the toast messages and print on screen

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//-> For getting the error we have commented the below lines
		
		//driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("Mahesh");
		//driver.hideKeyboard();
		driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElementById("android:id/text1").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bahrain\"))");
		driver.findElementByXPath("//*[@text='Bahrain']").click();
		driver.findElementByXPath("//android.widget.Button").click();
		
		//name attribute will contain the toast message
		String message=driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
		System.out.println(message);
		
							
		
	}

}
