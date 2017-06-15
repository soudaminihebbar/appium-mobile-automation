package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pages.login.GuidePage;
import steps.login.GuidePageSteps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by shebbar on 10/06/17.
 */
public class DriverFactory {

    public static AndroidDriver driver;

    @BeforeClass
    public static void initialiseAppiumAndroidDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("plarformVersion", "6.0.1");
        capabilities.setCapability("deviceName", "Nexus 5");
        capabilities.setCapability("appPackage", "com.aconex.field.mobile.ota");
        capabilities.setCapability("appActivity", "com.aconex.field.mobile.ota.FieldActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(new AppiumFieldDecorator(driver), new GuidePage());

    }

    public static void changeDriverContextToWeb(){
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            if (contextName.contains("WEBVIEW"))
                driver.context(contextName);
        }
    }
}

