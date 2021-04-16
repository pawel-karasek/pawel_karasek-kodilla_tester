package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    private List<WebElement> results = driver.findElements(By.cssSelector("div.yuRUbf > a"));
    RandomPage randomPage = new RandomPage(driver);

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
        int result = random.nextInt(7);
        randomPage.randomResult = results.get(result);
        Actions actions = new Actions(driver);
        actions.moveToElement(randomPage.randomResult).click().perform();
    }
}
