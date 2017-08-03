package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import pages.GuidePage;
import utils.DriverFactory;

import java.net.MalformedURLException;

/**
 * Created by shebbar on 21/06/17.
 */
public class GuidePageSteps {

    AndroidDriver driver;
    @Given("^I launched the app$")
    public void iLaunchedTheApp() throws Throwable {
        DriverFactory df = new DriverFactory();
        driver = df.initialiseAppiumAndroidDriver();
    }

    @When("^I close the Guide page$")
    public void iCloseTheGuidePage() throws MalformedURLException {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        GuidePage gp = new GuidePage(driver);

        gp.closeGuide();
    }
}
