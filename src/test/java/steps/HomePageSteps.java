package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pages.HomePage;

/**
 * Created by shebbar on 06/08/17.
 */
public class HomePageSteps {

    HomePage onHomePage;

    public HomePageSteps() {
        onHomePage = new HomePage();
    }

    @Then("^Home page should be displayed$")
    public void homePageShouldBeDisplayed() throws Throwable {
        onHomePage.verifyHomePageIsDisplayed();
    }
}
