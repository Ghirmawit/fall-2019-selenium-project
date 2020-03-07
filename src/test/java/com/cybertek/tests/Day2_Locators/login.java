package com.cybertek.tests.Day2_Locators;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    /*
    User story: As a user i should be able to login VyTrack app.
    test case 1 (positive)
    1. go to VyTrack login page
    2.write username data: storemanager52
    3.write password "  UserUser123
    4. click login button
    5. Verify that the User is on the login homepage

    test case2: login invalid cridental
    1. go to login page
    2. write invalid user name
    3. write invalid password
    4.click login button
    5. user should see error on the homepage
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        //find login button and then click
        WebElement loginBttn = driver.findElement(By.id("_submit"));
        loginBttn.click();

        //login button can be found and clicked directly
        //driver.findElement(By.id("_submit")).click;

        /*
        Verify that you are in the home page
         */

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("It fail");
        }
        String expectedPartialURL = "https://app.vytrack.com/";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedPartialURL)){
            System.out.println("Yes");
        }else {
            System.out.println("It doesn't have it");
            System.out.println("expectedPartialURL: " + expectedPartialURL);
            System.out.println("actual URL:" + actualURL);
        }
        driver.close();







    }
}
