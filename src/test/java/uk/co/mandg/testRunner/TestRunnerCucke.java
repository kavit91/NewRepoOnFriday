package uk.co.mandg.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//User//IdeaProjects//com.demoCucumber//feature//LogoutFeature.feature",
        glue = "StepDef",
        monochrome = true,
        plugin = {"pretty","html:target/HtmlReport/report.html"}
)
public class TestRunnerCucke {
}
