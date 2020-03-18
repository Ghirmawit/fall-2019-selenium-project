package com.cybertek.tests.day5_more_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassNameExample {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
       WebElement link =  driver.findElement(By.className("nav-link"));//home
        System.out.println(link.getText());

        // class name does not work if the value of the class attribute ha a space
//        WebElement loginBtn = driver.findElement(By.className("btn btn-primary"));
//        loginBtn.click();// this is gonna throw error "No such element exception"

    }
}
