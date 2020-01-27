package com.itechart.smg3;

import com.itechart.pages.LoginPage;
import com.itechart.pages.PersonalPage;
import com.itechart.driver.DriverFactory;
import com.itechart.driver.DriverType;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class Vacation {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/files/input.txt");
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("src/main/resources/files/output.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        String line; //value for each line in input.txt

        while((line=bufferedReader.readLine())!=null) {
            WebDriver driver;
            //System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/geckodriver.exe");
            driver = DriverFactory.getManager(DriverType.FIREFOX).getDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://192.168.15.26/");

            LoginPage loginPage = new LoginPage(driver);
            loginPage.logIn(line);

            PersonalPage personalPage = new PersonalPage(driver);

            printWriter.printf("Login %s: Vacation - %s; Illness  - %s", line, personalPage.getTextOnVacation(), personalPage.getTextOnIllness());
            printWriter.println();

            driver.quit();
        }

        printWriter.close();

    }
}
