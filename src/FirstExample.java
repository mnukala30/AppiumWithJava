import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FirstExample extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilities("real");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();//Xpath with index
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		//driver.findElementById("android:id/edit").sendKeys("Mahesh");
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("Mahesh");
		driver.findElementById("android:id/button1").click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}

}
