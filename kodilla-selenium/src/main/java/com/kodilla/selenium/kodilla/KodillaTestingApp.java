package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/pawelkarasek/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");

        WebElement inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        inputField.sendKeys("imię.nazwisko@gmail.com");

        WebElement inputField2 = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        inputField2.sendKeys("hasło");
        inputField2.submit();
    }
}
