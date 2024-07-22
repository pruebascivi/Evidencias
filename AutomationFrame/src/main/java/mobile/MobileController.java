package com.yourcompany.mobile.controllers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class MobileController {
    private AppiumDriver<MobileElement> driver;

    public void startAndroid() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app", "path/to/yourapp.apk");
        
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
    }

    public void startIOS() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("deviceName", "iPhone Simulator");
        caps.setCapability("app", "path/to/yourapp.app");
        
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
    }

    public void stopMobile() {
        if (driver != null) {
            driver.quit();
        }
    }

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }
}
