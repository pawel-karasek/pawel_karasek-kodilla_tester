package com.kodilla.selenium.google;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pawelkarasek/Documents/Development/Kodilla/chromedriver");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.switchTo().frame(0);
        WebElement agree = driver.findElement(By.id("introAgreeButton"));
        agree.click();

        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("kodilla");
        inputField.submit();
    }
}
