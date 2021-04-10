package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    //@FindBy(css = "div.yuRUbf > a")
    @FindBy(css = "div[class='g']")
    public List<WebElement> results;
    public WebElement randomResult;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public void clickRandomResult() {
        Random random = new Random();
        int result = random.nextInt(6);
        randomResult = results.get(result);// usunąłem prametr GoogleResults googleResults
        randomResult.click();
    }
}
