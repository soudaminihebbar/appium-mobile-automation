package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shebbar on 14/06/17.
 */
public class LoginPage {

    protected static AndroidDriver driver;

    @FindBy(css = "#fm-logon-username-field")
    private static WebElement loginName;

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), new HomePage());
    }

    public static void enterCredentials(String username, String password) {
        loginName.click();
        loginName.sendKeys(username);
    }
}
