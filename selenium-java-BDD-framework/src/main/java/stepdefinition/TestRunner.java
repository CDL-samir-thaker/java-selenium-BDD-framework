package stepdefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/BDD"},
        glue={"stepdefinition"},
        plugin = {
                "pretty","json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        },
        dryRun = false,
        tags = "@smoke"

)
public class TestRunner {

}
