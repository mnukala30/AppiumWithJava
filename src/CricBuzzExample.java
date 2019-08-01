import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CricBuzzExample extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		AppiumDriver<AndroidElement> driver = capabilities();
		driver.get("http://cricbuzz.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElementByXPath("//div[@class='btn-toolbar']/a/span[contains(@text(),'More Matches')]").click();
		
		driver.findElementByXPath("//*[@id='button-text']").click();
		driver.findElementByXPath("//div[@class='btn-group cbz-btn-group']/a[2]").click();
		driver.findElementByXPath("//span[contains(@text,'Menu')]").click();
		
		/*System.out.println("The list of player names are");
		for(int i=2; i<=12;i++){
			String name= driver.findElementByXPath("//*[@id='top']/div/div[12]/div[2]/div[i]/table/tbody/tr[1]/td[1]/a/b/span").getText();
			System.out.println(name);
		}*/
		
	}

	
}
