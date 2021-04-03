package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pawelkarasek/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/?stype=lo&jlou=Afd07CPv_auk9ak_E4xlB_IPLtcpalkpNwAeVXK9znwhus6d1HTAt54MZj-MjQX2pLbeQ-PaZSUpkN9Soy5OFET4&smuh=46332&lh=Ac97HESZNy2tC3Utj6U");

        WebElement yearCombo = driver.findElement(
                By.xpath("//+[@id=\\\"birthday_wrapper\\\"]/div/span/span/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
