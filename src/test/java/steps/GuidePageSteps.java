package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import pages.GuidePage;
import utils.DriverFactory;

import java.net.MalformedURLException;

/**
 * Created by shebbar on 21/06/17.
 */
public class GuidePageSteps {

    AndroidDriver androidDriver;

    @Given("^I launched the app$")
    public void iLaunchedTheApp() throws Throwable {
        DriverFactory driverFactory = new DriverFactory();
        androidDriver = driverFactory.initialiseAppiumAndroidDriver();
    }

    @When("^I close the Guide page$")
    public void iCloseTheGuidePage() throws MalformedURLException {

        GuidePage guidePage = new GuidePage(androidDriver);

        guidePage.closeGuide();
    }
}
