package sri.appium;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_tc_2 {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Base.capabilities();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("sri");
		driver.hideKeyboard();
		driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElementById("android:id/text1").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"));");
		driver.findElementByXPath("//*[@text='Aruba']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		System.out.println(driver.findElementsById("com.androidsample.generalstore:id/productName").size());
		
	}

}
