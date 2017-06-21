package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.GuidePage;
import utils.DriverFactory;

import java.net.MalformedURLException;

/**
 * Created by shebbar on 21/06/17.
 */
public class GuidePageSteps {
    @Given("^I launched the app$")
    public void iLaunchedTheApp() throws Throwable {
        DriverFactory.initialiseAppiumAndroidDriver();
    }

    @When("^I close the Guide page$")
    public void iCloseTheGuidePage() throws MalformedURLException {
        GuidePage.closeGuide();
    }
}
