package com.cybertek.tests.officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOH2 {
    public static void main(String[] args) {


    /*
    1. Go to http://automationpractice.com
    2.Search for 'tshirt' in a searchbox + click enter Or click search button
    3.validate you got 'no results' message on UI
    4. search for 't-shirt'
    5. Validate there was 1 result found

     */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
        WebElement search_box = driver.findElement(By.id("search_query_top"));
        //WebElement - class is selenium/java and it has many useful methods
        //.sendKeys("value that we want to send - input-box)
        search_box.sendKeys("tshirt"+ Keys.ENTER);
        /*
        class="alert alert-warning">
        No result were found for your search&nbsp;"tshirt"
        ,/p>
         */
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement error = driver.findElement(By.className("alet alert-warning"));
        String errorText = error.getText();
        //.getTest() --> return String (text) from the element
        System.out.println("Error message: " + errorText);
        //NoSuchElementException - it means we could not locate the element

        driver.quit();

    }
}