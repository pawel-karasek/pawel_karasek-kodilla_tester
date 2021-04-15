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
        System.setProperty("webdriver.chrome.driver", "/Users/pawelkarasek/IdeaProjects/kodilla-course/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void shouldOpenRandomResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        GoogleResults googleResults = googleSearch.searchResults();
        //GoogleResults x = new GoogleResults(driver);
        googleResults.clickRandomResult();
    }
}