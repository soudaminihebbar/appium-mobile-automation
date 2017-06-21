import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by shebbar on 21/06/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",
        format = {"html:target/cucumber-html-report/testFeature.html",
                "json:target/cucumber-report.json"})

public class RunCukesTest {
}
