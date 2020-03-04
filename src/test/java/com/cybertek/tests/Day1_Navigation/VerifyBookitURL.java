package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBookitURL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();

        String expectedPartialURL = "cybertek-reservation";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedPartialURL)){
            System.out.println("Yes");
        }else {
            System.out.println("It doesn't contain");
            System.out.println("expectedPartialURL: " + expectedPartialURL);
            System.out.println("actual URL:" + actualURL);
        }
        driver.close();

    }
}
