import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/seasonChecker/is_it_summet.feature",
                "src/test/resources/seasonChecker/is_number_divisible.feature",
                "src/test/resources/wallet/cash_withdrawal.feature"}
)

public class TestRunner {

}



