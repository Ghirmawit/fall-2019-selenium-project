package com.cybertek.tests.Day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");
        driver.manage().window().maximize();

        /*
        Write email to the text box
        1.Find the text box first --> findElement() from WebDriver

         */
        Thread.sleep(3000);
        WebElement emailBox =driver.findElement(By.id("okta-signin-username"));

        emailBox.sendKeys("girme@gmail.com");
        //Write password to the test box

        Thread.sleep(3000);
//        WebElement passwrdBox = driver.findElement(By.id("okta-signin-password"));
//        passwrdBox.sendKeys("gbgbgbg");
        driver.findElement(By.id("okta-signin-password")).sendKeys("abababab");

    }
}
