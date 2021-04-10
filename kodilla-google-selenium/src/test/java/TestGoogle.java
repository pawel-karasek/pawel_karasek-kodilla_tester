import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;

public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver= new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        //driver.close();
    }
    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResult();
    }
/*
    @Test
    public void testRandomResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        GoogleResults results = googleSearch.searchResult();
        //GoogleResults results = googleSearch.loadResults(driver);
        GoogleResults googleResults = new GoogleResults(driver);
        googleResults.clickRandomResult();
    }

 */
}
