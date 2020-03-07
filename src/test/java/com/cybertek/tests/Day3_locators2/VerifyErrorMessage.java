package com.cybertek.tests.Day3_locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

        /*
        1. go to login page
        2. enter invalid username
        3. enter invalid password
        4. Verify the error message
         */

        //testers will gather test data in excel sheet
        //generate from dummy data website
        //java faker
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://practice.cybertekschool.com/login");
            driver.manage().window().maximize();

            Faker fakeUser = new Faker();
            String userName = fakeUser.name().username();
            String password = fakeUser.app().author();
            driver.findElement(By.name("username")).sendKeys(userName);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.id("wooden_spoon")).click();
            //WebElement errorMessage = driver.findElement(By.id("flash error"));


    }
}
