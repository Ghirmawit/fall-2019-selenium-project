package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerify {
    public static void main(String[] args) {

        /*
        Task
        1.Go to Bookit login
        https://cybertek-reservation-qa.herokuapp.com/sign-in
        2. verify the title of the page
         */

        //expected actual
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();


        String expectedTitle = "bookit";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("I expected " +expectedTitle);
            System.out.println("The actual  is: " +actualTitle);
        }
        driver.close();


    }
}
