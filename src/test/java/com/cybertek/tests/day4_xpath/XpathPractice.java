package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {
        //go to practice login page
        //locate username box with absolute xpath
        //locate username box with relative xpath

         WebDriver driver = WebDriverFactory.getDriver("chrome");
         driver.get("http://practice.cybertekschool.com/login");
         driver.manage().window().maximize();
         //absolute
         WebElement usernameBoxAbs = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div[1]/input"));
         usernameBoxAbs.sendKeys("Login");
         WebElement usernameBoxRel = driver.findElement(By.xpath("//input['@type=text']"));
         usernameBoxRel.sendKeys("password");





    }
}
