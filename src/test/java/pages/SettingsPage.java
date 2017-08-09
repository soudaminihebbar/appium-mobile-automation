package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

/**
 * Created by shebbar on 07/08/17.
 */
public class SettingsPage {

    @FindBy(css = ".fm-settings-view-tab")
    private WebElement settingsTab;

    @FindBy(css = ".uiSettings-logout")
    private WebElement logout;

    public SettingsPage() {
        PageFactory.initElements(DriverFactory.androidDriver,this);
    }

    public void iTapOnSettings() {
        String title;
        settingsTab.click();
        title = DriverFactory.androidDriver.findElementByCssSelector("#fm-settings-view .title").getText();

        Assert.assertEquals("Settings", title);
    }

    public void iLogout() {
        logout.click();
    }
}
