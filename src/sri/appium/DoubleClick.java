package sri.appium;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;  
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;


class DoubleClick extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = Base.capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement button = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		TouchAction t= new TouchAction(driver);
		t.tap(tapOptions().withElement(element(button))).perform();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		WebElement button1 = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		t.longPress(longPressOptions().withElement(element(button1)).withDuration(ofSeconds(2))).release().perform();
		Thread.sleep(2000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
		
		
		
		
		
		
	}

}
