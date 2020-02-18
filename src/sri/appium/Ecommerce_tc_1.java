package sri.appium;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_tc_1 {

	public static void main(String[] args) throws MalformedURLException {

		
		AndroidDriver<AndroidElement> driver = Base.capabilities();
		
		//driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("sri");
		driver.hideKeyboard();
		driver.findElementByXPath("//*[@text='Female']").click();
		//driver.findElementById("android:id/text1").click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));
		//driver.findElementByXPath("//*[@text='India']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		String toastMessage = driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
		System.out.println(toastMessage);
		
			
		
	}
}
