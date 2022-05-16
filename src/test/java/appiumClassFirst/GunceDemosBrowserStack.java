package appiumClassFirst;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class GunceDemosBrowserStack {

    public static String userName = "ishakengl_qjScA2";
    public static String accessKey = "pP6DVzNyi4eyByAxW8qF";

    @Test
    public void Touch() throws MalformedURLException, InterruptedException {

//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
//        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\ishks\\IdeaProjects\\appiumNew\\src\\test\\java\\APP\\Gunce_base.apk");
        // ! Yukarıdaki path i kendinize göre ayarlayınız.

        // Use Java Client v6.0.0 or above
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Samsung Galaxy S10");
        capabilities.setCapability("app", "bs://e8aceabedfe1b82c401613acfbab7defd98e4364");

        //  AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), capabilities);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);



    }

}
