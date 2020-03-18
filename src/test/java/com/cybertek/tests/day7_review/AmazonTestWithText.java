package com.cybertek.tests.day7_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTestWithText {
    public static void main(String[] args) throws InterruptedException {
        /*
        **
        * 1. open browser
        * 2. go to amazon
        * 3. search for 'selenium cookbook'
        * 4. verify that there is result wit text 'Selenium Testing Tools Cookbook - Second Edition
        *
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        ////span[.='Selenium Testing Tools Cookbook - Second Edition']
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div[3]/div/input"));
        searchInput.sendKeys("selenium cookbook edition" + Keys.ENTER);

        Thread.sleep(2000);
        WebElement result = driver.findElement(By.xpath("//span[.='Selenium Testing Tools Cookbook - Second Edition']"));
        System.out.println(result.getText());
    }
}
