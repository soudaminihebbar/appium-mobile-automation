package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

import java.net.MalformedURLException;


/**
 * Created by shebbar on 11/06/17.
 */
public class GuidePage {

    protected static AndroidDriver driver;


    @FindBy(css = ".uiButton.uxBorder.icon.ic-close")
    private static WebElement closeGuideButton;

    @FindBy(css = "#fm-logon-username-field")
    private static WebElement loginName;

    public GuidePage(AndroidDriver driver) {

//        PageFactory.initElements(new AppiumFieldDecorator(driver), new LoginPage());
        PageFactory.initElements(driver, new LoginPage());
    }


    public void closeGuide() throws MalformedURLException {

        DriverFactory.changeDriverContextToWeb();

        closeGuideButton.click();
        Assert.assertTrue(loginName.isDisplayed());
    }


}
