package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

/**
 * Created by shebbar on 14/06/17.
 */
public class LoginPage {

    protected static AndroidDriver androidDriver;

    @FindBy(css = "#fm-logon-username-field")
    private static WebElement loginName;

    @FindBy(css = "#fm-logon-password-field")
    private static WebElement password;

    @FindBy(css = ".uiField-field input[disabled='disabled']")
    private static WebElement selectProjectLocation;

    @FindBy(css =".uiPanel-body ul li")
    private static WebElement otherInstace;

    @FindBy(css = ".primary")
    private static WebElement submit;

    @FindBy(css = "li.fm-home-view-tab")
    private static WebElement homeTab;

    public LoginPage(AndroidDriver androidDriver) throws MalformedURLException {
        PageFactory.initElements(androidDriver, this);
    }

    public void enterCredentials(String username, String userPassword) {
        loginName.click();
        loginName.sendKeys(username);
        password.click();
        password.sendKeys(userPassword);
    }

    public void enterProjectLocation(String instance) {
        selectProjectLocation.click();
        androidDriver.findElementByLinkText("Other").click();
    }

    public void login() {
        submit.click();
    }


}
