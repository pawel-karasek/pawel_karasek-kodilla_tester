package com.kodilla.selenium.visual;

import org.openqa.selenium.WebDriver;

public class WorldTimePage {
    private static final String pageURL = "https://www.worldtimeserver.com/current_time_in_AW.aspx";

    private WebDriver webDriver;

    public WorldTimePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void open() {
        webDriver.get(pageURL);
    }
    public void close() {
        webDriver.quit();
    }
}
