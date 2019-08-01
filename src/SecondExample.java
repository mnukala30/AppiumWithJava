import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SecondExample extends Base{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilities("real");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Animation']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Cloning']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Run']")).click();
		
	}

}
