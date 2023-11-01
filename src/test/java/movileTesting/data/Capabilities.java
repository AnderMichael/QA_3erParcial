package movileTesting.data;

public enum Capabilities {
    DEVICE_NAME("appium:deviceName", "Andersaurio Wifi"),
    PLATFORM_VERSION("appium:platformVersion", "9"),

    // Para el WhenDo
    APP_PACKAGE("appium:appPackage", "com.vrproductiveapps.whendo"),
    APP_ACTIVITY("appium:appActivity", "com.vrproductiveapps.whendo.ui.HomeActivity"),

    // Para la APP Contactos
//    APP_PACKAGE("appium:appPackage", "com.android.contacts"),
//    APP_ACTIVITY("appium:appActivity", "com.android.contacts.activities.DialtactsActivity"),
    AUTOMATION_NAME("appium:automationName", "uiautomator2"),
    PLATFORM_NAME("appium:platformName", "Android"),
    UDID("appium:udid", "RFXNW18B02001493");

    private final String capabilityName;
    private final String capabilityValue;

    Capabilities(String capabilityName, String capabilityValue) {
        this.capabilityName = capabilityName;
        this.capabilityValue = capabilityValue;
    }

    public String getCapabilityName() {
        return capabilityName;
    }

    public String getCapabilityValue() {
        return capabilityValue;
    }
}