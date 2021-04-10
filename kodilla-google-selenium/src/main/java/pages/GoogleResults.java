package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }
/*
    public void clickRandomResult() {
        Random random = new Random();
        int result = random.nextInt(6);
        randomResult = results.get(result);// usunąłem prametr GoogleResults googleResults
        WebDriverWait wait = new WebDriverWait(driver, 10); //
        wait.until(ExpectedConditions.elementToBeClickable(randomResult)); // dodałem warunek żeby randomResult było klikalne
        randomResult.click();
    }

 */
}