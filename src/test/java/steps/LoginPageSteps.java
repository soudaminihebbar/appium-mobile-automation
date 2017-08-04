package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import pages.LoginPage;

/**
 * Created by shebbar on 21/06/17.
 */
public class LoginPageSteps {
    AndroidDriver androidDriver;
//    IOSDriver iosDriver;



    @Given("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        LoginPage loginPage = new LoginPage(androidDriver);
        loginPage.enterCredentials(username, password);
    }

    @And("^I select project location \"([^\"]*)\"$")
    public void iSelectProjectLocation(String instance) throws Throwable {
        LoginPage loginPage = new LoginPage(androidDriver);
        loginPage.enterProjectLocation(instance);
    }

    @Then("^I tap on Login$")
    public void iTapOnLogin() throws Throwable {
        LoginPage loginPage = new LoginPage(androidDriver);
        loginPage.login();
    }
}
