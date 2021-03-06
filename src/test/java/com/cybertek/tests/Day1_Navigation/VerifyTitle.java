package com.cybertek.tests.Day1_Navigation;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {


    /*
    1. Go to cybertek practice web site
    2. Verify Title

    Actual Title? -->

    http://practice.cybertekschool.com/
     */

        //connect browser and driver
        //setup browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" http://practice.cybertekschool.com/");
        driver.manage().window().maximize();

        String expectedTitle = "practice";

        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        }else {

            System.out.println("Fail");
            System.out.println("I expected " +expectedTitle);
            System.out.println("The Actual title is " +actualTitle);
        }
        driver.close();


}
}