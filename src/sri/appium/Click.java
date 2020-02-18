package sri.appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Click extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver= capabilities();
		
		//driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Preference\")").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = '3. Preference dependencies' ]").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("hello");
		driver.findElementById("android:id/button1").click();
	}

}
