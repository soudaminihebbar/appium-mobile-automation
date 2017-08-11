import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.AppiumFactory;

/**
 * Created by shebbar on 21/06/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",
        format = {"html:target/cucumber-html-report/testFeature.html",
                "json:target/cucumber-report.json"})

public class RunCukesTest {


    @BeforeClass
    public static void startAppium() {
        AppiumFactory.startAppiumServer();
    }

    @AfterClass
    public static void stopAppium() {
        AppiumFactory.stopAppiumServer();
    }
}
