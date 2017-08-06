package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.net.MalformedURLException;

/**
 * Created by shebbar on 05/08/17.
 */
public class BasePage {
    private AndroidDriver androidDriver;
//    DriverFactory driverFactory;
//    = new DriverFactory();
    private WebDriverWait wait = new WebDriverWait(androidDriver, 200);

    public BasePage() throws MalformedURLException {
//        driverFactory = new DriverFactory();
//        androidDriver = driverFactory.initialiseAppiumAndroidDriver();
//        wait = new WebDriverWait(androidDriver,100);
    }

    public void waitForElementToBeVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
