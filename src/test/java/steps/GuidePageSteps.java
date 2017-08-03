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
        DriverFactory df = new DriverFactory();
        androidDriver = df.initialiseAppiumAndroidDriver();
    }

    @When("^I close the Guide page$")
    public void iCloseTheGuidePage() throws MalformedURLException {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        GuidePage gp = new GuidePage(androidDriver);

        gp.closeGuide();
    }
}
