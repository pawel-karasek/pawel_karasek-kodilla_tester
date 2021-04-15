package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    //@FindBy(css = " div.yuRUbf > a")
    //private List<WebElement> results;
    WebElement randomResult;

    private List<WebElement> results = driver.findElements(By.cssSelector(" div.yuRUbf > a"));

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
        randomResult = results.get(result);
        randomResult.click();
    }
}
