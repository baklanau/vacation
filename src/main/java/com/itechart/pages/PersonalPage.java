package com.itechart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalPage {
    private WebDriver driver;

    public PersonalPage(WebDriver driver) {
        this.driver = driver;
    }

    private By textOnVacation = By.xpath("//span[@class='leave-title' and text()='Vacation']/following-sibling::span");
    private By textOnIllness = By.xpath("//span[@class='leave-title' and text()='Illness']/following-sibling::span");

    public String getTextOnVacation() {
        return driver.findElement(textOnVacation).getText();
    }

    public String getTextOnIllness() {
        return driver.findElement(textOnIllness).getText();
    }
}
