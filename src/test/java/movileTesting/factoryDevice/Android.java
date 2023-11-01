package movileTesting.factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import movileTesting.data.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", Capabilities.DEVICE_NAME.getCapabilityValue());
        capabilities.setCapability("platformVersion", Capabilities.PLATFORM_VERSION.getCapabilityValue());
        capabilities.setCapability("appPackage", Capabilities.APP_PACKAGE.getCapabilityValue());
        capabilities.setCapability("appActivity", Capabilities.APP_ACTIVITY.getCapabilityValue());
        capabilities.setCapability("platformName", Capabilities.PLATFORM_NAME.getCapabilityValue());
        capabilities.setCapability("automationName", Capabilities.AUTOMATION_NAME.getCapabilityValue());
        capabilities.setCapability("udid", Capabilities.UDID.getCapabilityValue());

        AndroidDriver device = null;

        try {
            device = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        device.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return device;
    }
}