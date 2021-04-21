import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/is_it_summet.feature", "src/test/resources/is_number_divisible.feature"}
)

public class TestRunner {

}



