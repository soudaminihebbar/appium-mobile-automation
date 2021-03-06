package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pages.GuidePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by shebbar on 10/06/17.
 */
public class DriverFactory {

    public static AndroidDriver androidDriver;

// ***   For IOS
//    public static IOSDriver iosDriver;
//    For IOS ****

    public  AndroidDriver initialiseAppiumAndroidDriver() throws MalformedURLException {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("plarformVersion", "6.0.1");
        capabilities.setCapability("deviceName", "Nexus 5");
        capabilities.setCapability("appPackage", "field.mobile.ota");
        capabilities.setCapability("appActivity", "field.mobile.MainActivity");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


        androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), new GuidePage(androidDriver));

      return androidDriver;
    }

//    public IOSDriver initialiseAppiumIOSDriver() throws MalformedURLException {
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("automationName", "XCUITest");
//        capabilities.setCapability("deviceName", "Bangalore Field Team iPhone iOS");
//        capabilities.setCapability("udid", "8555fe22af4f9e1c92de78c5bd1fea55375a36d8");
//        capabilities.setCapability("bundleId", "com.aconex.field.mobile.dev");
//        capabilities.setCapability("xcodeConfigFile", "~/appium.xcconfig");
//
//        iosDriver = new IOSDriver(new URL("http://127.0.01:4723/wd/hub"), capabilities);
//
//        iosDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        PageFactory.initElements(new AppiumFieldDecorator(iosDriver), new GuidePage(iosDriver));
//
//
//        return iosDriver;
//    }

    public static void changeDriverContextToWeb(){
        Set<String> contextNames = androidDriver.getContextHandles();
        for (String contextName : contextNames) {
            if (contextName.contains("WEBVIEW"))
                androidDriver.context(contextName);
        }
    }
}

