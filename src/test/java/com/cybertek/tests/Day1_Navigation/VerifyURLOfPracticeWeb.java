package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) throws InterruptedException {

        /*
        1. go to cybertek practice website
        http://practice.cybertekschool.com/
        2. verify the URL

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        String  expectedURL= "http://practice.cybertekschool.com/";
        String actualURL = driver.getCurrentUrl();
        Thread.sleep(3000);

        if (expectedURL.equals(actualURL)){
            System.out.println("Pass");
        }else{
            System.out.println("It is Fail");
            System.out.println("I expected " +expectedURL);
            System.out.println("The actual URL is: " +actualURL);
        }
        Thread.sleep(3000);
    }
}
