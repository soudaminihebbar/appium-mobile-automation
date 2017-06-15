package steps.login;

import org.junit.Test;
import pages.login.GuidePage;
import utils.DriverFactory;

import java.net.MalformedURLException;

/**
 * Created by shebbar on 14/06/17.
 */
public class GuidePageSteps{

    public GuidePageSteps() {

    }

    @Test
    public void a_initialiseAppium() throws MalformedURLException {
        DriverFactory.initialiseAppiumAndroidDriver();
    }

    @Test
    public void b_closeGuide() throws MalformedURLException {
        GuidePage.closeGuide();
    }
}
