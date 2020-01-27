package com.itechart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    private By domainName = By.xpath("//input[@id='DomainName']");
    private By logInButton = By.xpath("//button");

    public void logIn(String logIn) {
        driver.findElement(domainName).sendKeys(logIn);
        driver.findElement(logInButton).submit();
    }

}
