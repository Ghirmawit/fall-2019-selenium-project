package com.cybertek.tests.Day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EbaySearch {
    public static void main(String[] args) throws Exception {
        //locators --> ID, name, classname,
        /*
        If class attribute's value has space
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.ebay.com/");

        //I used name here just for practice
        WebElement searchBox = driver.findElement(By.name("_nkw"));

        Thread.sleep(3000);
        searchBox.sendKeys("shoes", Keys.ENTER);

        //WebElement searchBttn = driver.findElement(By.id("gh-btn"));
        //searchBox.click();

        //Verify title contains search item
        //expected vs actual
        String expectedPartialTitle = "shoes";
        String actual = driver.getTitle();
        if (actual.contains(expectedPartialTitle)) {
            System.out.println("Yes");
        } else {
            System.out.println("No it doesn't");
        }
        driver.close();







    }
}
