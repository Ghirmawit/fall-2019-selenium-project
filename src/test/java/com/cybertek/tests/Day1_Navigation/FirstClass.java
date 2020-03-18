package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        //WebDriver object ---> Interface
        //I have a driver
        WebDriver driver = new ChromeDriver();

        // I want to open Google home page

        //how do you launch / open a web page?
        //by using get() --> url a String
       // driver.get("https://www.google.com");

        //Navigation's
        //navigate().to() --> open a page

       // driver.navigate().to("https://www.google.com");

        //get() vs .to()
        //get() --> will wait to load the page
        //to() --> does not wait to load

        //navigate().back() -->
        //1. got to google 2. got to cybertek practice website

        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        driver.navigate().back();

        //navigate().forward()
        //go to practice --> go to google --> back to practice
        //--> forward to google


    }
}
