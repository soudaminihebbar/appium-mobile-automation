package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.SettingsPage;

/**
 * Created by shebbar on 07/08/17.
 */
public class SettingsPageSteps {

    SettingsPage onSettingsPage;

    public SettingsPageSteps() {
        onSettingsPage = new SettingsPage();
    }

    @And("^I tap on Settings tab$")
    public void iTapOnSettingsTab() throws Throwable {
        onSettingsPage.iTapOnSettings();
    }

    @And("^I logout$")
    public void iLogout() throws Throwable {
        onSettingsPage.iLogout();
    }
}
