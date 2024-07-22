package mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTestBase {
    protected AppiumDriver<MobileElement> driver;

    @Parameters({"platformName"})
    @BeforeMethod
    public void setUp(String platformName) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        switch (platformName.toLowerCase()) {
            case "android":
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
                caps.setCapability(MobileCapabilityType.APP, "path/to/app.apk");
                driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
                break;

            case "ios":
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
                caps.setCapability(MobileCapabilityType.APP, "path/to/app.ipa");
                driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
                break;

            default:
                throw new IllegalArgumentException("Unsupported platform: " + platformName);
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
