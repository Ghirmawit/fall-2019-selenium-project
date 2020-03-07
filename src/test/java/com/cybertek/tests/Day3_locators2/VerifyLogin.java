package com.cybertek.tests.Day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();

        //locating the welcome message with tagName
        WebElement welcomeMessage = driver.findElement(By.tagName("h4"));

        // Verify the welcome Message
        // expected vs actual
        String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";

        //String vs WebElement in order to convert string to WebElement we use .getText
        String actualWelcomeMessage = welcomeMessage.getText();

        if (expectedMessage.equalsIgnoreCase(actualWelcomeMessage)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.close();

    }
}
