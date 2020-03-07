package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute2 {
    public static void main(String[] args) {
        /*
        go to
        http://practice.cybertekschool.com/dynamic_loading
        locate Example 1

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement example1 = driver.findElement(By.linkText("/dynamic loading/1"));
        System.out.println(example1.getAttribute("hrefkkml,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, l "));
    }
}
