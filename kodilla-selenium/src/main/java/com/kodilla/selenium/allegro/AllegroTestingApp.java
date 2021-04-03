package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pawelkarasek/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement categoryField = driver.findElement(
                By.xpath("/html/body/div[2]/div[5]/header/div/div/div[1]/div/form/div/div[2]/div/select"));
        categoryField.sendKeys("Elektronika");

        WebElement searchField = driver.findElement(
                By.xpath("/html/body/div[2]/div[5]/header/div/div/div[1]/div/form/div/input"));
        searchField.sendKeys("mavic mini");

        WebElement searchButton = driver.findElement(
                By.xpath("/html/body/div[2]/div[5]/header/div/div/div[1]/div/form/div/button"));
        searchButton.submit();
    }
}
