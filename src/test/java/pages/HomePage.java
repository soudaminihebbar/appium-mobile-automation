package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.utilities.Assert;
import utils.DriverFactory;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


/**
 * Created by shebbar on 21/06/17.
 */
public class HomePage {

    WebDriverWait wait;

    @FindBy(css = "li.fm-home-view-tab")
    private WebElement home;

    public HomePage() {
        PageFactory.initElements(DriverFactory.androidDriver, this);
        wait = new WebDriverWait(DriverFactory.androidDriver,200);
    }


    public void verifyHomePageIsDisplayed() {
        waitForElementToBeVisible(home);

        assertTrue(home.isDisplayed());
    }

    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }
}
