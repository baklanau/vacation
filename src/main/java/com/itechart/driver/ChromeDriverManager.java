package com.itechart.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

}
