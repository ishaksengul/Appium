package appiumClassFirst;





       //     curl -u "ishakengl_qjScA2:pP6DVzNyi4eyByAxW8qF" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\ishks\IdeaProjects\appiumNew\src\test\java\AppiumClassFirst\APP\etsy.apk"


import java.net.URL;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
        import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserStackTest {

    public static String userName = "ishakengl_qjScA2";
    public static String accessKey = "pP6DVzNyi4eyByAxW8qF";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "FirstTest");
        caps.setCapability("name", "BrowserStack");
        caps.setCapability("app", "bs://6ed29733a583735f6516dd3717dc04efded8a00a");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

        driver.quit();
    }
}
