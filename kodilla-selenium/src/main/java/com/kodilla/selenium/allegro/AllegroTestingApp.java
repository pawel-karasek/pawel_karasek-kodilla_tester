package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pawelkarasek/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Select categoryField = new Select(driver.findElement(
                By.cssSelector("body > div.main-wrapper > div:nth-child(5) > header > div > div > div:nth-child(1) > div > form > div > div.mpof_5r.mpof_ki_s.mp7g_oh.m389_6m.mjyo_6x.mse2_40.mp4t_0.mr3m_0.mli2_0.m911_co.mnyp_co.mdwl_co.mx7m_1.mefy_5r.mlkp_ag.msts_9u._d25db_1Qn1q > div > select")));
        categoryField.selectByValue("/kategoria/elektronika");

        WebElement searchField = driver.findElement(
                By.cssSelector("body > div.main-wrapper > div:nth-child(5) > header > div > div > div:nth-child(1) > div > form > div > input"));
        searchField.sendKeys("mavic mini");

        WebElement searchButton = driver.findElement(
                By.cssSelector("body > div.main-wrapper > div:nth-child(5) > header > div > div > div:nth-child(1) > div > form > div > button"));
        searchButton.submit();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> articles = driver.findElements(By.cssSelector("section>article"));
        articles.forEach(a -> System.out.println(a.getText()));

    }
}
