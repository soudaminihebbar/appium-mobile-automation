package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.login.LoginPage;
import utils.DriverFactory;

import java.net.MalformedURLException;


/**
 * Created by shebbar on 11/06/17.
 */
public class GuidePage {

    protected static AndroidDriver driver;


    @FindBy(css = ".uiButton.uxBorder.icon.ic-close")
    private static WebElement closeGuide;

    @FindBy(css = "#fm-logon-username-field")
    private static WebElement loginName;

    public GuidePage() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), new LoginPage());
    }


    public static void closeGuide() throws MalformedURLException {

        DriverFactory.changeDriverContextToWeb();

        closeGuide.click();
        Assert.assertTrue(loginName.isDisplayed());
    }


}
