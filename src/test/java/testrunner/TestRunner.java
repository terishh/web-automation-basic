package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/",
        glue = {"stepdefinitions"},
        plugin = {"pretty", "io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm"},
        tags = {"not @WIP"}
)
public class TestRunner {
}
