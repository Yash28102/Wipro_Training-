package PomTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Tutorial.feature",
        glue = "test",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class Page {

}