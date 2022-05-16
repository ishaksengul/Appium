package appiumClassFirst;

import java.net.URL;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

//     curl -u "ishakengl_qjScA2:pP6DVzNyi4eyByAxW8qF" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\ishks\IdeaProjects\appiumNew\src\test\java\AppiumClassFirst\APP\apidemos.apk"


public class ApiDemosBrowserStack {

    public static String userName = "ishakengl_qjScA2";
    public static String accessKey = "pP6DVzNyi4eyByAxW8qF";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "FirstTest");
        caps.setCapability("name", "ApiDemosBrowserStack");
        caps.setCapability("app", "bs://c396c46e3ba236c37cc25b0bf3ff232c7efeabd7");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

        WebElement preference = driver.findElementByAccessibilityId("Preference");
        preference.click();

        Thread.sleep(2000);
        WebElement preferenceDependencies = driver.findElementByAccessibilityId("3. Preference dependencies");
        preferenceDependencies.click();

        WebElement checkBox = driver.findElementById("android:id/checkbox");
        checkBox.click();

        Thread.sleep(2000);

        WebElement wifiSetting = driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]"));
        wifiSetting.click();

        WebElement inputBox = driver.findElementById("android:id/edit");

        inputBox.sendKeys("appiumTest");

        WebElement okButton = driver.findElementById("android:id/button1");

        Assert.assertEquals("appiumTest",inputBox.getText());

        okButton.click();



        driver.quit();
}
}
