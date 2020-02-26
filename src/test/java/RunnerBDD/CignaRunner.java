package RunnerBDD;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",glue={"com.capitalone.tests"},
        tags="@footer",
        plugin = { "pretty", "html:target/cucumber-reports" }

)



public class CignaRunner {

}
