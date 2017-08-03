package steps;

import cucumber.api.java.en.Given;
import pages.LoginPage;

/**
 * Created by shebbar on 21/06/17.
 */
public class LoginPageSteps {

    @Given("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        LoginPage.enterCredentials(username, password);
    }
}
