package appiumClassFirst;

import java.net.URL;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

    public class BrowserStackIOS {

        public static String userName = "ishakengl_qjScA2";
        public static String accessKey = "pP6DVzNyi4eyByAxW8qF";

        public static void main(String args[]) throws MalformedURLException, InterruptedException {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "ios");
            capabilities.setCapability("platformVersion", "14");
            capabilities.setCapability("deviceName", "iPhone 12");
            capabilities.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");

            IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);

            IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
            textButton.click();
            IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
            textInput.sendKeys("hello@browserstack.com\n");

            Thread.sleep(5000);

            IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));

            if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
                assert(true);
            else
                assert(false);

            // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
            driver.quit();
        }
    }
