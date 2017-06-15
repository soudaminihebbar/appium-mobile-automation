package pages.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Test;
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
    private static WebElement closeGuide;

    public GuidePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), new LoginPage() );
    }
//    public LoginPage() {
//
//        PageFactory.initElements(new AppiumFieldDecorator(driver),new HomePage());
//    }


    public static void closeGuide() throws MalformedURLException {
//        driver = DriverFactory.initialiseAppiumAndroidDriver();


        DriverFactory.changeDriverContextToWeb();
        closeGuide.click();
    }

}
