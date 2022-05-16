package apkTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TrendyolTest {

    @Test
    public void s10TestTrendyol() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM_G973F");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RF8M407J87R");
        desiredCapabilities.setCapability("noReset", "true");
        //? noReset, true olarak ayarlanırsa, bu oturum başlamadan önce uygulama verileri SİLİNMEZ.
        //? fullReset true olarak ayarlanırsa uygulama kaldırılır ve tüm veriler temizlenir.
        // desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gunceproapp.GunceCloud");
        // desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "crc645e33510600e34ad5.MainActivity");
        // ! Yukarıdaki path i kendinize göre ayarlayınız.


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

    }
}
